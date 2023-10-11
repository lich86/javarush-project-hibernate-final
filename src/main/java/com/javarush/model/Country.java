package com.javarush.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(schema = "world", name = "country")
@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Country {
    @Id
    @Column(name = "id")
    Integer id;

    String code;

    @Column(name = "code_2")
    String alternativeCode;

    String name;

    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    Continent continent;

    String region;

    @Column(name = "surface_area")
    BigDecimal surfaceArea;

    @Column(name = "indep_year")
    Short independenceYear;

    Integer population;

    @Column(name = "life_expectancy")
    BigDecimal lifeExpectancy;

    @Column(name = "gnp")
    BigDecimal GNP;

    @Column(name = "gnpo_id")
    BigDecimal GNPOId;

    @Column(name = "local_name")
    String localName;

    @Column(name = "government_form")
    String governmentForm;

    @Column(name = "head_of_state")
    String headOfState;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capital")
    City city;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    Set<CountryLanguage> languages;

}
