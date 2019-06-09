package com.starter.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		List<String> lst = Arrays.asList(args);
		System.out.println(lst);
	}

}
