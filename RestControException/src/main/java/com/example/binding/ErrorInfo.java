package com.example.binding;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfo {

	public String msg;
	
	public String code;
	
	public LocalDateTime when;
}
