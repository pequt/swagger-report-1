package com.example.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "object with some boolean field", value = "SomeObject")
public class SomeObject {
	@ApiModelProperty(value = "boolean field name starts with no 'is'")
	private boolean bool1;
	@ApiModelProperty(value = "boolean value name starts with 'is'")
	private boolean isBool2;
	@ApiModelProperty(value = "name value desc")
	private String name;

	public void setBool1(boolean bool1) {
		this.bool1 = bool1;
	}

	public boolean isBool1() {
		return bool1;
	}

	public void setBool2(boolean bool2) {
		isBool2 = bool2;
	}

	public boolean isBool2() {
		return isBool2;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
