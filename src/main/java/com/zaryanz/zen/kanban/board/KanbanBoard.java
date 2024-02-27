package com.zaryanz.zen.kanban.board;

import java.util.Arrays;
import java.util.List;

import org.hibernate.validator.constraints.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "boards")
public class KanbanBoard {
	 
	@Override
	public String toString() {
		return "KanbanBoard [id=" + id + ", title=" + title + ", description=" + description + ", columns=" + columns
				+ "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "Please provide a title")
	@Column(name = "title")
	private String title;
	
	@NotBlank(message = "Please provide a description")
	@Column(name = "description")
	private String description;
	
	@Column(name = "columns")
	private List<String> columns = Arrays.asList("Backlog", "In Progress", "Done");
}
