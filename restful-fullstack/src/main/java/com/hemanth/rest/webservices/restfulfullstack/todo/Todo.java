package com.hemanth.rest.webservices.restfulfullstack.todo;

import java.util.Date;

public class Todo {

	private long id;
	private String username;
	private String description;
	private boolean isComplete;
	private Date target;
	
	protected Todo() {
		
	}
	
	public Todo(long id, String username, String description, boolean isComplete,  Date target) {
		this.id = id;
		this.username = username;
		this.description = description;
		this.target = target;
		this.isComplete = isComplete;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTarget() {
		return target;
	}
	public void setTarget(Date target) {
		this.target = target;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
}
