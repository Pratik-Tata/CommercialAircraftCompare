package com.example.CommercialAircraftCompare.Model;

import lombok.Getter;
import lombok.Setter;

public class Manufacturer {
    @Getter @Setter private int id_internal;
    @Getter @Setter private String makeName;
    @Getter @Setter private String countryOfOrigin;
    @Getter @Setter private int yearOfOrigin;

    public Manufacturer(int id_internal, String makeName, String countryOfOrigin, int yearOfOrigin) {
        this.id_internal = id_internal;
        this.makeName = makeName;
        this.countryOfOrigin = countryOfOrigin;
        this.yearOfOrigin = yearOfOrigin;
    }
}
