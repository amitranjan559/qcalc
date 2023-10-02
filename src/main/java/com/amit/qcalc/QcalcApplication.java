package com.amit.qcalc;

//port org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args); // by commenting this line project has become a simple proj
		System.out.println("cal is running: Standard Calculator 1.0");

		StandardCalculator standardCalculator= new StandardCalculator();
		standardCalculator.division(-2.3,3);
		standardCalculator.getResult();

	}

}
