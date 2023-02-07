package com.Masai.Service;

import java.util.List;

import com.Masai.Exception.EntaryException;
import com.Masai.Model.Entry;
import com.Masai.dto.EntaryDTO;

public interface EntaryService {

	List<EntaryDTO> getAllEntaryByCategory(String category)throws EntaryException;
	
	EntaryDTO saveEntary(Entry entry)throws EntaryException;
}
