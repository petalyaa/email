package com.pet.email.generic.model;

import java.io.Serializable;

public class BaseVO implements Serializable {

	private static final long serialVersionUID = -8825580490920092282L;
	
	private boolean success;
	
	private String failedMsg;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getFailedMsg() {
		return failedMsg;
	}

	public void setFailedMsg(String failedMsg) {
		this.failedMsg = failedMsg;
	}

}
