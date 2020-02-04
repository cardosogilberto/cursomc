package com.nelioalves.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String error;
	private Long timestamp;
	
	public StandardError(Integer status, String error, Long timestamp) {
		super();
		this.status = status;
		this.error = error;
		this.timestamp = timestamp;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	

}
