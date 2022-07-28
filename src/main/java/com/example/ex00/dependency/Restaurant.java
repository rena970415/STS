package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Component
@AllArgsConstructor
@Getter
public class Restaurant {

	@Autowired
	private final Chef chef;
}
