package com.example.CommercialAircraftCompare.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.time.Year;


public class Manufacturer {
    @Getter @Setter private int id_internal;
    @Getter @Setter private String makeName;
    @Getter @Setter private String countryOfOrigin;
    @Getter @Setter private Year yearOfOrigin;

    public Manufacturer(int id_internal, String makeName, String countryOfOrigin, Year yearOfOrigin) {
        this.id_internal = id_internal;
        this.makeName = makeName;
        this.countryOfOrigin = countryOfOrigin;
        this.yearOfOrigin = yearOfOrigin;
    }
}
