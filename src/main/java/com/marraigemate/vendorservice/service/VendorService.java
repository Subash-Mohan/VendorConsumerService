package com.marraigemate.vendorservice.service;

import com.marraigemate.vendorservice.DTO.KafkaVendorUpdateDTO;
import com.marraigemate.vendorservice.DTO.VendorDTO;

import java.io.IOException;

public interface VendorService {
    public String registerVendor(VendorDTO vendorDTO) throws IOException;
    public String updateVendor(KafkaVendorUpdateDTO kafkaVendorUpdateDTO);
    public String deleteVendor(String vendorId);

}
