package com.zaryanz.zen.kanban.board;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class KanbanBoard {
	
	private @Id @GeneratedValue long id;
	private String title;
	private String description;
	private List<String> columns;
}
