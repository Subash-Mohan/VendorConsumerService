package com.marraigemate.vendorservice.collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pricing {
    private Integer price;

    private String unit;

    private String currency;
}
