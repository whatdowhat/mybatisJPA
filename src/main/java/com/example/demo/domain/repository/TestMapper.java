package com.example.demo.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.City;

@Mapper
public interface TestMapper {

	List<City> findyAll();
	
	List<City> findyName(@Param(value = "name") String name );
	
}
