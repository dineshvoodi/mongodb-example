package com.learning.spring.mongodbexample.repository;

import com.learning.spring.mongodbexample.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

    Customer findByName(String name);
}
