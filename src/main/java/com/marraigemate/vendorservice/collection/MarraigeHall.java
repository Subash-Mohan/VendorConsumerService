package com.marraigemate.vendorservice.collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarraigeHall {
    private Integer capacity;

    private List<String> facilities;

    private List<String> images;

    private Pricing pricingPerDay;
}
