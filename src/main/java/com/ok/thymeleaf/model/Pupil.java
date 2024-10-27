package com.ok.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pupil {

    private String firstName;
    private String lastName;
    private String sex;
    private String city;
    private String favoriteDrink;
    private List<String> favoriteCars;

}
