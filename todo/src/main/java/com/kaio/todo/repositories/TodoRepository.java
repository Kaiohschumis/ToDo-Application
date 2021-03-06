package com.kaio.todo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kaio.todo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

	@Query("SELECT obj FROM Todo obj WHERE onj.finalizado = false ORDER BY obj.data")
	List<Todo> findAllOpen();
	
	@Query("SELECT obj FROM Todo obj WHERE onj.finalizado = true ORDER BY obj.data")
	List<Todo> findAllClose();

}
