package com.grokonez.jwtauthentication.controller;



public class GoMessage {
	GoMessageType messageType;
	String[] args;
	String message;
	Integer code;



	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public GoMessageType getMessageType() {
		return messageType;
	}

	public void setMessageType(GoMessageType messageType) {
		this.messageType = messageType;
		this.code = messageType.code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GoMessage(GoMessageType messageType) {
		this.messageType = messageType;
		this.code = messageType.code;
	}

	public GoMessage(GoMessageType messageType, String[] args) {
		this.messageType = messageType;
		this.args = args;
	}

	public GoMessage(GoMessageType messageType, String[] args, Integer code) {
		this.messageType = messageType;
		this.args = args;
		this.code = code;
	}
}