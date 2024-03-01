package com.company.TypeConversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TypeConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TypeConversionApplication.class, args);
		/*byte byteVar = 42;
		short shortVar = byteVar;
		int intVar = shortVar;
		long longVar = intVar;
		float floatVar = longVar;
		double doubleVar = floatVar;*/

		double doubleVar = 42.0d;
		float floatVar = (float) doubleVar;
		long longVar = (long) floatVar;
		int intVar = (int) longVar;
		short shortVar = (short) intVar;
		byte byteVar = (byte) shortVar;

		char char1 = 1, char2 = 2;
		short short1 = 1, short2 = 2;
		int int1 = 1, int2 = 2;
		float float1 = 1.0f, float2 = 2.0f;


		short1 = (short) (short1+short2);
		System.out.println(short1);
	}

}
