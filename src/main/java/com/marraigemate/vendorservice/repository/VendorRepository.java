package com.marraigemate.vendorservice.repository;


import com.marraigemate.vendorservice.collection.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends MongoRepository<Vendor, String> {
}
