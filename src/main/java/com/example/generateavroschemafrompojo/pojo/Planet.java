package com.example.generateavroschemafrompojo.pojo;

import com.example.generateavroschemafrompojo.pojo.common.Details;
import lombok.Getter;

@Getter
public abstract class Planet {

    private String planetName;
    private String planetSize;
    private Long distanceFromSun;
    private Integer numberOfMoons;
    private Details details;
}
