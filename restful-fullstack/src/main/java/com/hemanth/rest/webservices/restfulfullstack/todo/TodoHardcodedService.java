package com.hemanth.rest.webservices.restfulfullstack.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int idcounter =3;
	
	static {
		todos.add(new Todo(++idcounter,"Hemanth","Learn React and Angular",false, new Date()));
		todos.add(new Todo(++idcounter,"Hemanth","Learn React and Angular",false,new Date()));
		todos.add(new Todo(++idcounter,"Hemanth","Learn React and Angular",false, new Date()));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	
	public Todo deleteById(long id) {
		Todo todo = findbyId(id);
		if(todo==null) {
			return null;
		}
		
			
		if(todos.remove(todo)) {
			return todo;
		}
		
		return null;
	}


	public Todo findbyId(long id) {
		
		for(Todo todo: todos) {
			if(todo.getId()==id) {
				return todo;
			}
		}
		return null;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idcounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}

}
