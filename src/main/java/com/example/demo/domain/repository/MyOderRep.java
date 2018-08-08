package com.example.demo.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.MyOrder;

public interface MyOderRep extends CrudRepository<MyOrder, Integer>{

}
