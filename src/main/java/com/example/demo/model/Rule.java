package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Data

public class Rule {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String fieldName;
    String operator;
    String value;


}




