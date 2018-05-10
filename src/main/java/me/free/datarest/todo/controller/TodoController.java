package me.free.datarest.todo.controller;

import me.free.datarest.common.Constants;
import me.free.datarest.todo.domain.Todo;
import me.free.datarest.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * @author Lee Tae Su
 * @version 1.0
 * @project datarest
 * @since 2018-05-10
 */
@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping(value = Constants.basePath + "/todos/{todoKey}")
	public ResponseEntity<Todo> getTodo(@PathVariable Long todoKey) {
		return ResponseEntity.ok(todoService.findById(todoKey));
	}
	
	@DeleteMapping(value = Constants.basePath + "/todos/{todoKey}")
	public void deleteTodo(@PathVariable Long todoKey, @RequestParam("reason") String reason) {
		Todo todo = new Todo();
		todo.setTodoKey(todoKey);
		todo.setReason(reason);
		
		todoService.deleteTodo(todo);
		System.out.println("delete " + todoKey + " of todo");
	}
}
