package me.free.datarest.todo.repository;

import me.free.datarest.todo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project datarest
 * @since 2018-05-10
 */
@RepositoryRestResource(collectionResourceRel = "todo", path = "todos")
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
