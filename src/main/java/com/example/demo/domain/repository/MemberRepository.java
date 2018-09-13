package com.example.demo.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Member;

public interface MemberRepository extends CrudRepository<Member, Integer>{


	Page<Member> findAll(Pageable pageable);
}
