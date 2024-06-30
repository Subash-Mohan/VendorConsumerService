package com.marraigemate.vendorservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarraigeHallDTO {
    private Integer capacity;

    private List<String> facilities;

    private List<String> images;

    private PricingDTO pricingPerDay;

}
