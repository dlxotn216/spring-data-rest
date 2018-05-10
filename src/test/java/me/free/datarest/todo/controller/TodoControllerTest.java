package me.free.datarest.todo.controller;

import me.free.datarest.common.Constants;
import me.free.datarest.todo.domain.Todo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Lee Tae Su on 2018-05-10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
public class TodoControllerTest {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	public void 생성테스트() {
		//Given
		Todo todo = new Todo();
		todo.setTitle("테스트1");
		todo.setDescription("aefaewf 온르의 TODO");
		
		//When
		ResponseEntity<Todo> result = testRestTemplate.postForEntity(Constants.basePath + "/todos", todo, Todo.class);
		
		//Then
		assertThat(result.getStatusCode()).isEqualTo(HttpStatus.CREATED);
		
	}
	
}