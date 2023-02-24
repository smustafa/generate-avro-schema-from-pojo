package com.example.generateavroschemafrompojo.pojo;

import lombok.Getter;

import java.util.List;

@Getter
public class Universe {

    private Long numberOfPlanets;
    private List<Planet> planets;

}
