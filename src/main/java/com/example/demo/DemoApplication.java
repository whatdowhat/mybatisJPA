package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domain.Department;
import com.example.demo.domain.Member;
import com.example.demo.domain.repository.DepartmentRepostiry;
import com.example.demo.domain.repository.MemberRepository;

@SpringBootApplication
public class DemoApplication {

	Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner myDemain(MemberRepository memberRepository,DepartmentRepostiry departmentRepostiry) {
		
		
		
		return (args)->{
			
			logger.info("############# :: {}",memberRepository.count());
			
			Department department =  new Department();
			department.setDepartName("1번부서");
			department.setRemark("this is a remark ");
			
			departmentRepostiry.save(department);
			memberRepository.save(new Member("이길동", 2, department));
			memberRepository.save(new Member("홍길동", 1, department));
			memberRepository.save(new Member("삼길동", 3, department));
			memberRepository.save(new Member("사길동", 4, department));
			memberRepository.save(new Member("오길동", 5, department));
			
			logger.info("############# :: {}",departmentRepostiry.count());
			
			
			
			logger.info("############# ::is present {}",departmentRepostiry.findById(1).isPresent());
			
			Optional<Department> de = departmentRepostiry.findById(1);
			Optional<Member> me = memberRepository.findById(1);
			
			logger.info("#::list size is  {}",de.get().getMembers().size());
			
			
			de.get().getMembers().stream()
			.forEach(System.out::println); 
			
			
			
			logger.info("############# :: {}",memberRepository.findById(2).get().getDepartment().getDepartName());
			logger.info("############# :: {}",memberRepository.count());
			
		};
	}
}
