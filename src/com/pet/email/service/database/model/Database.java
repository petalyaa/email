package com.pet.email.service.database.model;

import java.sql.Timestamp;

import com.pet.email.generic.model.BaseObject;

public class Database extends BaseObject {

	private static final long serialVersionUID = 1407634811774267179L;

	private long id;
	
	private String name;
	
	private long userId;
	
	private String description;
	
	private Timestamp dataCreated;
	
	private boolean active;
	
	private String type;
	
	private long size;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDataCreated() {
		return dataCreated;
	}

	public void setDataCreated(Timestamp dataCreated) {
		this.dataCreated = dataCreated;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
