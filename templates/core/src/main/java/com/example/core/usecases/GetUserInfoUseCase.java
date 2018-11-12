package com.example.core.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.core.model.User;
import com.example.core.ports.GetUserPort;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class GetUserInfoUseCase {
	@Autowired
	private final GetUserPort getUserPort;
	
	public User get() {
		return getUserPort.get();
	}
	
	public User get(int id) {
		return getUserPort.get(id);
	}
}
