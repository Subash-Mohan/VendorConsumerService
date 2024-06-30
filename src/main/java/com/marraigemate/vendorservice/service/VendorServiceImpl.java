package com.marraigemate.vendorservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marraigemate.vendorservice.DTO.KafkaVendorUpdateDTO;
import com.marraigemate.vendorservice.DTO.VendorDTO;
import com.marraigemate.vendorservice.collection.Vendor;
import com.marraigemate.vendorservice.repository.VendorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class VendorServiceImpl implements VendorService{

    private static final Logger log = LoggerFactory.getLogger(VendorServiceImpl.class);
    @Autowired
    private VendorRepository vendorRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    @KafkaListener(topics = "vendor-registered", groupId = "vendor-consumer")
    public String registerVendor(VendorDTO vendorDTO) {
        Vendor vendor = objectMapper.convertValue(vendorDTO, Vendor.class);
        return vendorRepository.save(vendor).getId();
    }

    @Override
    @KafkaListener(topics = "vendor-updated", groupId = "vendor-consumer")
    public String updateVendor(KafkaVendorUpdateDTO kafkaVendorUpdateDTO) {
        Update update = new Update();
        kafkaVendorUpdateDTO.getVendorUpdateRequestList().forEach(vendorUpdateRequest -> {
            update.set(vendorUpdateRequest.getProperty(), vendorUpdateRequest.getValue());
        });
        mongoTemplate.updateFirst(query(where("id").is(kafkaVendorUpdateDTO.getVendorId())), update, Vendor.class);
        return kafkaVendorUpdateDTO.getVendorId();
    }

    @Override
    @KafkaListener(topics = "vendor-deleted", groupId = "vendor-consumer")
    public String deleteVendor(String vendorId) {
        vendorRepository.deleteById(vendorId);
        return vendorId;
    }
}
