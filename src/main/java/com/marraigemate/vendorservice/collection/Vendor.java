package com.marraigemate.vendorservice.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vendors")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vendor {
    @Id
    private String id;

    private String name;

    private String description;

    private VendorType type;

    private MarraigeHall hallDetails;

    private Catering cateringDetails;

    private HallDecoration hallDecorationDetails;

    private Availability availability;

    private Contact contact;

    private Address address;
}
