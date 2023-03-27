package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/soma/{numberOne}/{numberTwo}")

public class MathController {
			
			
		private final AtomicLong contador= new AtomicLong();
		@GetMapping
			public Double soma(
					@PathVariable(value = "numberOne") String numberOne,
					@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
			
				if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
					throw new Exception();
				}
				return convertToDouble(numberOne) + convertToDouble(numberTwo);
			}
		
		
		
		
					private Double convertToDouble(String number) {
						if(number ==null) {
							return 0D;
						}else if(isNumeric(number)) {
							return Double.parseDouble(number);
						}
						return 0D;
					}
					
					private boolean isNumeric(String number) {
						if(number ==null) {
							return false;
										}try {
									        double d = Double.parseDouble(number);
									    } catch (NumberFormatException e) {
									        return false;
									    }
										    return true;
										
					}
}
