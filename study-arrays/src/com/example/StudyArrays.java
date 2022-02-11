package com.example;

import java.util.List;
import java.util.stream.Stream;

public class StudyArrays {

	public static void main(String[] args) {
		List<String> names = List.of("jack","kate");
		int x = 42; // scalar
		int numbers1[] = { 4, 8, 15, 16, 23, 42 };
		int numbers2[] = new int[] { 4, 8, 15, 16, 23, 42 };
		Integer numbers3[] = new Integer[6];
		numbers3[0] = 4;
		numbers3[1] = 8;
		numbers3[2] = 15;
		numbers3[3] = 16;
		numbers3[4] = 23;
		numbers3[5] = 42;
		System.out.println(numbers3.length);
		for (var i=0;i<numbers3.length;++i) {
			System.out.println(numbers3[i]);
		}
		for (var number : numbers3)
			System.out.println(number);
		for (var name : names) {
			System.out.println(name);
		}
		var sum = 0;
		for (var number : numbers3) {
			if (number%2 == 0) {
				var squared = number * number;
				sum += squared;
			}
				
		}
		System.out.println("sum: "+sum);
		// Functional Programming
		sum =
		Stream.of(numbers3)
		      .flatMap(Stream::of)
		      .filter( num -> num%2 == 0)
		      .mapToInt( num -> num*num)
		      .sum();
		System.out.println("sum: "+sum);
		
	}

}
