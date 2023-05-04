package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
	@Id
		public int id;
		public String username;
		public String password;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return username;
		}
		public void setName(String name) {
			this.username = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Login [id=" + id + ", name=" + username + ", password=" + password + "]";
		}

}
