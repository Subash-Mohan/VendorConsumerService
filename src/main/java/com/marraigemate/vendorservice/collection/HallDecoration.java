package com.marraigemate.vendorservice.collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HallDecoration {
    private List<String> styles;

    private Map<String, Pricing> pricingPerStyle;

    private List<String> portfolioImages;
}
