package me.free.datarest.todo.service.impl;

import me.free.datarest.todo.domain.Todo;
import me.free.datarest.todo.repository.TodoRepository;
import me.free.datarest.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project datarest
 * @since 2018-05-10
 */
@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public Todo findById(Long toodKey){
		return todoRepository.findById(toodKey).orElse(new Todo());
	}
	
	@Override
	public Todo deleteTodo(Todo todo) {
		todo.setDeleted(true);
		return todoRepository.save(todo);
	}
}
