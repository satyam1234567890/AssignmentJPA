package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Dao.TranieeDao;
import com.example.demo.entity.Traniee;



@SpringBootApplication
public class AssignmentjpaApplication  {     //implements CommandLineRunner

/*
    @Autowired
	TranieeDao tdo;
	*/
	public static void main(String[] args) {
		SpringApplication.run(AssignmentjpaApplication.class, args);
	}
	
	/*@Override
	public void run(String arg[]) throws Exception {
		
		
		  Traniee t1 = new Traniee(1, "sachin", "delhi");
		  Traniee t2 = new Traniee(2,"ravi","punjab");
		
		  
		 tdo.create(t1); 
		 tdo.create(t2); 
		  
		 
		
	}*/
	


}
