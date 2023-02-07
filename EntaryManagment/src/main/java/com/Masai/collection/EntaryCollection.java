package com.Masai.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.Service.EntaryService;
import com.Masai.dto.EntaryDTO;

@RestController
public class EntaryCollection {
	
	@Autowired
	private EntaryService entaryService;

	@GetMapping("/entries")
	public ResponseEntity<List<EntaryDTO>> getAllEntryByCategoryHandler(@RequestParam("category") String category){
		
		return new ResponseEntity<List<EntaryDTO>>(entaryService.getAllEntaryByCategory(category),HttpStatus.OK);
	}
}
