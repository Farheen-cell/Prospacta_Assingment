package com.Masai.Model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entry implements Serializable {
	
	@JsonProperty
	@Id
	private String API;
	
	@JsonProperty
	private String Discription;
	
	@JsonProperty
	private String Auth;
	
	@JsonProperty
	private boolean HTTPS;
	
	@JsonProperty
	private String Cors;
	
	@JsonProperty
	private String Link;
	
	@JsonProperty
	private String category;

}
