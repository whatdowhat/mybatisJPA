package com.example.demo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.example.demo.domain.City;
import com.example.demo.domain.Department;
import com.example.demo.domain.Member;
import com.example.demo.domain.MyChildrenOne;
import com.example.demo.domain.MyChildrenTwo;
import com.example.demo.domain.MyOderAndProduct;
import com.example.demo.domain.MyOrder;
import com.example.demo.domain.MyProduct;
import com.example.demo.domain.repository.AccessDomainRepository;
import com.example.demo.domain.repository.DepartmentRepostiry;
import com.example.demo.domain.repository.DomainSampleRepository;
import com.example.demo.domain.repository.MemberRepository;
import com.example.demo.domain.repository.MyChildrenOneRep;
import com.example.demo.domain.repository.MyChildrenTwoRep;
import com.example.demo.domain.repository.MyOPRep;
import com.example.demo.domain.repository.MyOderRep;
import com.example.demo.domain.repository.MyProductRep;
import com.example.demo.domain.repository.TestMapper;

@SpringBootApplication
public class DemoApplication {

	@Value("${spring.mail.port}")
	String test;
	
	org.slf4j.Logger logger =  LoggerFactory.getLogger(this.getClass());
	
//	private static final org.apache.logging.log4j.Logger logger4j2 = LogManager.getLogger(DemoApplication.class);
	private static final Logger logger4j2 = LogManager.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner myDemain(MemberRepository memberRepository,DepartmentRepostiry departmentRepostiry, DomainSampleRepository domainSampleRepository, AccessDomainRepository accessDomainRepository
			,MyOderRep myOderRep, MyProductRep myProductRep , MyOPRep myOPRep
			,MyChildrenOneRep myChildrenOneRep , MyChildrenTwoRep myChildrenTwoRep,
			TestMapper testMapper
			) {
		
		
		
		return (args)->{
			
			
			MyProduct  myProduct1 = new MyProduct();
			
			myProduct1.setProductName("쥐포");
			myProduct1.setProduectQuantity(1);
			myProduct1.setProduectPrice(new BigDecimal(11));
			
			
			myProductRep.save(myProduct1);
			
			MyProduct  myProduct2 = new MyProduct();
			myProduct2.setProductName("다른거");
			myProduct2.setProduectQuantity(2);
			myProduct2.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct2);
			
			
			MyProduct  myProduct3 = new MyProduct();
			myProduct3.setProductName("라면1");
			myProduct3.setProduectQuantity(1);
			myProduct3.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct3);
			
			myProduct3 = new MyProduct();
			myProduct3.setProductName("라면2");
			myProduct3.setProduectQuantity(1);
			myProduct3.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct3);
			
			myProduct3 = new MyProduct();
			myProduct3.setProductName("라면3");
			myProduct3.setProduectQuantity(1);
			myProduct3.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct3);
			
			myProduct3 = new MyProduct();
			myProduct3.setProductName("소시지");
			myProduct3.setProduectQuantity(1);
			myProduct3.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct3);
			
			myProduct3 = new MyProduct();
			myProduct3.setProductName("과자");
			myProduct3.setProduectQuantity(1);
			myProduct3.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct3);
			
			myProduct3 = new MyProduct();
			myProduct3.setProductName("음료1");
			myProduct3.setProduectQuantity(1);
			myProduct3.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct3);
			
			myProduct3 = new MyProduct();
			myProduct3.setProductName("음료2");
			myProduct3.setProduectQuantity(1);
			myProduct3.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct3);
			
			myProduct3 = new MyProduct();
			myProduct3.setProductName("음료3");
			myProduct3.setProduectQuantity(1);
			myProduct3.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct3);
			
			myProduct3 = new MyProduct();
			myProduct3.setProductName("기타1");
			myProduct3.setProduectQuantity(1);
			myProduct3.setProduectPrice(new BigDecimal(22));
			myProductRep.save(myProduct3);
			
			myProduct3 = new MyProduct();
			myProduct3.setProductName("기타2");
			myProduct3.setProduectQuantity(100);
			myProduct3.setProduectPrice(new BigDecimal(22000));
			myProductRep.save(myProduct3);
			
			MyOrder myOrder1 = new MyOrder();
			myOrder1.setOrderBy("홍길동");
			myOrder1.setOrderRegisterTime(new Date());
			myOderRep.save(myOrder1);
			
			MyOrder myOrder2 = new MyOrder();
			
			myOrder2.setOrderBy("이길동");
			myOrder2.setOrderRegisterTime(new Date());
			myOderRep.save(myOrder2);
			
			MyOderAndProduct myOderAndProduct1 = new MyOderAndProduct();
			
			myOderAndProduct1.setMyOrder(myOrder1);
			myOderAndProduct1.setMyProduct(myProduct1);
			myOPRep.save(myOderAndProduct1);
//			PageRequest pageRequest = PageRequest.of(0, 10, Sort.by(Direction.ASC,"age","id"));
//			PageRequest pageRequest = PageRequest.of(0, 5,Sort.by(Direction.DESC, "produectQuantity"));
			PageRequest pageRequest = PageRequest.of(0, 5,Sort.by(Direction.DESC, "productId"));
			
			
			
			
//			System.out.println("@@@@");
//			System.out.println(myProductRep.findAll(pageRequest).getSize());
//			myProductRep.findAll(pageRequest).getContent().stream().forEach(System.out::println);
//			System.out.println("@@@@");
//			System.out.println(test);
//			
//			MyChildrenOne childrenOne = new MyChildrenOne();
//			
//			
//			childrenOne.setAuthor("what?");
//			childrenOne.setRegDate(new Date());
//			childrenOne.setUpDate(new Date());
//			
//			myChildrenOneRep.save(childrenOne);
//			
//			childrenOne = new MyChildrenOne();
//			
//			
//			childrenOne.setAuthor("hohoW?");
//			childrenOne.setRegDate(new Date());
//			childrenOne.setUpDate(new Date());
//			
//			myChildrenOneRep.save(childrenOne);
//			
//			MyChildrenTwo childrentwo = new MyChildrenTwo();
//			
//			childrentwo.setSinger("singer name");
//			childrentwo.setRegDate(new Date());
//			childrentwo.setUpDate(new Date());
//			
//			myChildrenTwoRep.save(childrentwo);
//			
//			myChildrenOneRep.findAll().forEach(item -> 
//			
//			{
//				System.out.println(item.getAuthor());
//				System.out.println(item.getRegDate());  
//				System.out.println(item.getUpDate());
//			
//			
//			});
//			
//			myChildrenTwoRep.findAll().forEach(item -> 
//			
//			{
//				
//				System.out.println(item.getSinger());
//				System.out.println(item.getRegDate());  
//				System.out.println(item.getUpDate());
//			
//			
//			});
			
			

			
			
			
			Department department =  new Department();
			
			department.setDepartName("1번부서");
			department.setRemark("this is a remark ");
			

			
			departmentRepostiry.save(department);
			memberRepository.save(new Member("이길동", 2, department));
			memberRepository.save(new Member("홍길동", 1, department));
			memberRepository.save(new Member("삼길동", 3, department));
			memberRepository.save(new Member("사길동", 4, department));
			memberRepository.save(new Member("오길동", 5, department));
			
			
			PageRequest commonPage = PageRequest.of(0, 10, Sort.by(Direction.ASC,"id"));
			memberRepository.findAll(commonPage).getContent().stream().forEach(System.out::println);
			
			
			
//			System.out.println("#############"+myOderAndProduct1.toString());
			
//			myOderAndProduct1 = new MyOderAndProduct();
//			myOderAndProduct1.setMyOrder(myOrder1);
//			myOderAndProduct1.setMyProduct(myProduct2);
//			
//			
//			
//			
//			myOPRep.save(myOderAndProduct1);
//			
//			
//			myOderAndProduct1 = new MyOderAndProduct();
//			myOderAndProduct1.setMyOrder(myOrder2);
//			myOderAndProduct1.setMyProduct(myProduct2);
//			
//			myOPRep.save(myOderAndProduct1);
//			
//			myOderAndProduct1 = new MyOderAndProduct();
//			myOderAndProduct1.setMyOrder(myOrder2);
//			myOderAndProduct1.setMyProduct(myProduct2);
//			myOPRep.save(myOderAndProduct1);
//			
//
//
//			
////			System.out.println(			myOderRep.findByOrderBy("홍길동").isEmpty());
//			myOderRep.findByOrderBy("홍길동").stream().forEach(System.out::println);
//			
//			myOderRep.findByOrderBy("홍길동").stream().forEach(item -> myOPRep.findByMyOrder(item).stream().forEach(System.out::println));
//			myOPRep.findById(5);
//			myProductRep.findAll();
//			
//		
//			myProductRep.findById(2).get().getList().forEach(System.out::println);
//			
//			
//			
//			myOderRep.findById(3).get().getList().forEach(System.out::println);
//			

			
			testMapper.findyName("Fall River");
			
	        logger4j2.debug("Debugging log");
	        logger4j2.info("Info log");
	        logger4j2.warn("Hey, This is a warning!");
	        logger4j2.error("Oops! We have an Error. OK");
	        logger4j2.fatal("Damn! Fatal error. Please fix me.");
			System.out.println("################################################");
			
			myOPRep.findAll();
		};
	}
}
