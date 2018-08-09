package com.example.demo.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.MyOrder;

public interface MyOderRep extends CrudRepository<MyOrder, Integer>{

    List<MyOrder>	findByOrderBy(String orderBy);
    
	
}
