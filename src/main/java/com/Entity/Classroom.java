package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "classrooms")
public class Classroom {
	
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(nullable = false)
		private String name;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Classroom(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public Classroom() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Classroom [id=" + id + ", name=" + name + "]";
		}

		
		
	}


