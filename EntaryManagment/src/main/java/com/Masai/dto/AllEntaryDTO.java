package com.Masai.dto;

import java.io.Serializable;
import java.util.List;

import com.Masai.Model.Entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllEntaryDTO implements Serializable{
	
	private Integer count;
	private List<Entry> entries;

}
