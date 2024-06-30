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
public class Catering {
    private List<String> cuisines;

    private List<MenuItem> menu;

    private Integer capacityMax;

    private Integer capacityMin;

    private Pricing pricingPerPerson;
}
