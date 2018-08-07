package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domain.Member;
import com.example.demo.domain.repository.MemberRepository;

@SpringBootApplication
public class DemoApplication {

	Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner myDemain(MemberRepository memberRepository) {
		
		
		
		return (args)->{
			
			logger.info("############# :: {}",memberRepository.count());
			
			
			memberRepository.save(new Member("홍길동", 1));
			
			logger.info("############# :: {}",memberRepository.count());
			
		};
	}
}
