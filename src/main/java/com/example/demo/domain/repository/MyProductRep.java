package com.example.demo.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.MyOderAndProduct;
import com.example.demo.domain.MyProduct;

public interface MyProductRep extends CrudRepository<MyProduct, Integer>{

}
