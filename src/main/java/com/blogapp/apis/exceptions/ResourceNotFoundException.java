package com.blogapp.apis.exceptions;

 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Setter
@Getter
@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException{
	String resourceName;
	String fieldName;
	int fieldValue;
	public ResourceNotFoundException(String resourceName, String fieldName, int fieldValue) { 
		super(String.format("%s is not found with %s : %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	
	
}
