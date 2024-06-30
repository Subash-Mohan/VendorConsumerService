package com.marraigemate.vendorservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private GeoPointDTO location;
    private String landmark;

}
