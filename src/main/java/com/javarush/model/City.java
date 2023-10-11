package com.javarush.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(schema = "world", name = "city")
@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;

    String district;

    Integer population;
}
