package com.marraigemate.vendorservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class KafkaVendorUpdateDTO {
    String vendorId;
    List<VendorUpdateRequest> vendorUpdateRequestList;
}
