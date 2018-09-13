package com.example.demo.domain.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Department;
import com.example.demo.domain.MyOrder;

public interface DepartmentRepostiry extends CrudRepository<Department, Integer>{

	Collection<Department> findById(int id);
	
}
