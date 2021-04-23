package com.kaio.todo.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.kaio.todo.domain.Todo;
import com.kaio.todo.repositories.TodoRepository;

public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar SpringBoot e Angular",
				LocalDateTime.parse("25/03/22 10:40", formatter), false);

		todoRepository.saveAll(Arrays.asList(t1));

	}

}
