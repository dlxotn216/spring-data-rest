package me.free.datarest.todo.service;

import me.free.datarest.todo.domain.Todo;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project datarest
 * @since 2018-05-10
 */
public interface TodoService {
	Todo findById(Long toodKey);
	
	Todo deleteTodo(Todo todo);
}
