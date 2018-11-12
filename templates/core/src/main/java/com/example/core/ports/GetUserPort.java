package com.example.core.ports;

import com.example.core.model.User;

public interface GetUserPort {
	public User get();
	public User get(int id);
}
