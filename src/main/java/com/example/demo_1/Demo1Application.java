package com.example.demo_1;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Demo1Application {

	@RequestMapping("/")
        String home() {
                return "<h1 style='color: gray; font-family:'Titillium Web', sans-serif; padding: 10px; padding-left: 20px;}'>Hello There!</h1>";

        }

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
