package me.free.datarest.todo.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project datarest
 * @since 2018-05-10
 */
@Entity
@Table
@Getter
@Setter
@Audited
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TodoSeqGenerator")
	@SequenceGenerator(name = "TodoSeqGenerator", sequenceName = "TODO_SEQ")
	private Long todoKey;
	
	private String title;
	
	private String description;
	
	private Integer priority;
	
	private boolean deleted;
	
	private String reason;
	
}
