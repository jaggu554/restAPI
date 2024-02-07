package com.example.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.binding.ErrorInfo;
import com.example.binding.UserNotFound;

@RestControllerAdvice
public class ExceptionClass {

	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ErrorInfo> handleSave(Exception e){
		String msg=e.getMessage();
		ErrorInfo info=new ErrorInfo();
		info.setCode("Jaggu00554");
		info.setMsg(msg);
		info.setWhen(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = UserNotFound.class)
	public ResponseEntity<ErrorInfo> handleUNF(Exception e) {
		String msg = e.getMessage();
		ErrorInfo info = new ErrorInfo();
		info.setCode("Jaggu0001");
		info.setMsg(msg);
		info.setWhen(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(info, HttpStatus.BAD_REQUEST);
	}
}
