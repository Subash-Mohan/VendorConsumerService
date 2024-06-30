package com.marraigemate.vendorservice.DTO;

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
public class HallDecorationDTO {
    private List<String> styles;

    private Map<String, PricingDTO> pricingPerStyle;

    private List<String> portfolioImages;

}
