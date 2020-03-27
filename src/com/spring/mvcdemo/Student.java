package com.spring.mvcdemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
//    private LinkedHashMap<String, String> countryOptions;

    public Student() {
//        // populate country options: ISO country code used
//        countryOptions = new LinkedHashMap<>();
//        countryOptions.put("BR", "Brazil");
//        countryOptions.put("RU", "Russia");
//        countryOptions.put("FR", "France");
//        countryOptions.put("DE", "Germany");
//        countryOptions.put("US", "United States");
    }

//    public LinkedHashMap<String, String> getCountryOptions() {
//        return countryOptions;
//    }

    public String getCountry() {
        return country;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
