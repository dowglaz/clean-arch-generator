package com.example.dataprovider;

import org.springframework.stereotype.Component;

import com.example.core.model.User;
import com.example.core.ports.GetUserPort;

@Component
public class GetUserAdapter implements GetUserPort {
	@Override
	public User get() {
		return User.builder().name("Corellia").surname("Core").build();
	}

	@Override
	public User get(int id) {
		return User.builder().name("Corellia").surname("Core").id(String.valueOf(id)).build();
	}
}
