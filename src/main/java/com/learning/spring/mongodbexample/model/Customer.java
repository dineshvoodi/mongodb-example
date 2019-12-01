package com.learning.spring.mongodbexample.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "customer")
public class Customer {

    @Id
    private String id;

    private String name;

    private String city;

}
