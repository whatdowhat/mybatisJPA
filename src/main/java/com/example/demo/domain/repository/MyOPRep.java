package com.example.demo.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.MyOderAndProduct;
import com.example.demo.domain.MyOrder;
import com.example.demo.domain.MyProduct;

public interface MyOPRep extends CrudRepository<MyOderAndProduct, Integer>{

	
	List<MyOderAndProduct> findByMyOrder(MyOrder myOrder);
	List<MyOderAndProduct> findByMyProduct(MyProduct myProduct);
	
}
