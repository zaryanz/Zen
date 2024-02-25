package com.zaryanz.zen.kanban.board;

import java.util.List;

public interface KanbanBoardService {
	KanbanBoard createBoard(KanbanBoard board);
	
	KanbanBoard getBoardById(long boardId);
	
	List<KanbanBoard> getAllBoards();
}
