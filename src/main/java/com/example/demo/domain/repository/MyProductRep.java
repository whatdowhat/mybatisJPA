package com.example.demo.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.MyProduct;

public interface MyProductRep extends CrudRepository<MyProduct, Integer>{

	
	Page<MyProduct> findAll(Pageable pageable);
	
}
