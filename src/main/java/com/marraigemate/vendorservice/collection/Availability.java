package com.marraigemate.vendorservice.collection;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Availability {
    private List<String> days;

    private String startTime;

    private String endTime;
}
