package com.zaryanz.zen.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter @Setter @NoArgsConstructor
public class Role {

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
}
