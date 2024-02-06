package com.zaryanz.zen.kanban.board;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KanbanBoardController {
	
	private final KanbanBoardRepository repository;
	
	KanbanBoardController(KanbanBoardRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/boards")
	List<KanbanBoard> getAllBoards() {
		return repository.findAll();
	}
	
	@PostMapping("/board")
	KanbanBoard createBoard(@RequestBody KanbanBoard board) {
		try {
			System.out.println(board);
//			repository.save(board);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
//		return repository.save(null);
	}
}
