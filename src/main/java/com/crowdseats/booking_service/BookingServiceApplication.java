package com.crowdseats.booking_service;

import com.crowdseats.framework.common.util.ProfileSetup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingServiceApplication {

	public static void main(String[] args) {
		System.setProperty("service.name", "booking");
//		SpringApplication.run(BookingServiceApplication.class, args);
		ProfileSetup.setupProfile(new SpringApplication(BookingServiceApplication.class), args);
	}

}
