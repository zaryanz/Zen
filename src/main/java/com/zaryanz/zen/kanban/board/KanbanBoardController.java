package com.zaryanz.zen.kanban.board;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class KanbanBoardController {
	
	private final KanbanBoardRepository repository;
	
	KanbanBoardController(KanbanBoardRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/boards/{id}")
	List<KanbanBoard> all() {
		return repository.findAll();
	}
}
