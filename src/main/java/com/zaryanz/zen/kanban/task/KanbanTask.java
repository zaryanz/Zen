package com.zaryanz.zen.kanban.task;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class KanbanTask {
	
	@GeneratedValue
	private long id;
	private String description;
	private String status;
	private String asignee;
	private Set<String> tags;
}
