package com.AttendeceAndClassroomMgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class AttendeceAndClassroomMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendeceAndClassroomMgmtApplication.class, args);
	}

}
