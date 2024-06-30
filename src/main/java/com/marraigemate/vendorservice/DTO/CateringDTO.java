package com.marraigemate.vendorservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CateringDTO {
    private List<String> cuisines;

    private List<MenuItemDTO> menu;

    private Integer capacityMax;

    private Integer capacityMin;

    private PricingDTO pricingPerPerson;

}
