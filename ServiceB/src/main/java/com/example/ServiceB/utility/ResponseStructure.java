package com.example.ServiceB.utility;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ResponseStructure {
	

	int status;
	String message;

}
