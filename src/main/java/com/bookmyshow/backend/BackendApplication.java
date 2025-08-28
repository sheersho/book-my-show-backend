package com.bookmyshow.backend;

import com.bookmyshow.backend.model.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	BaseModel baseModel = new BaseModel();
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
