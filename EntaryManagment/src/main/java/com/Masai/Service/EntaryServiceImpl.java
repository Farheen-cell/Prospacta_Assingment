package com.Masai.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Masai.Exception.EntaryException;
import com.Masai.Model.Entry;
import com.Masai.dto.AllEntaryDTO;
import com.Masai.dto.EntaryDTO;

@Service
public class EntaryServiceImpl implements EntaryService {

	private static final String BASE_URL="https://api.publicapis.org";
	private RestTemplate restTamplate=new RestTemplate();
	
	@Override
	public List<EntaryDTO> getAllEntaryByCategory(String category) throws EntaryException {
		// TODO Auto-generated method stub
		AllEntaryDTO allEntoryDTO=restTamplate.getForObject(BASE_URL+"/entries", AllEntaryDTO.class);
		
		List<EntaryDTO> entries=new ArrayList<>();
		
		if(allEntoryDTO.getEntries().isEmpty()) throw new EntaryException("No Entary foun tolode");
		
		for(Entry entry : allEntoryDTO.getEntries()) {
			if(entry.getCategory().equalsIgnoreCase(category)) {
				EntaryDTO dto=new EntaryDTO();
				
				dto.setTitale(entry.getAPI());
				dto.setDescription(entry.getDiscription());
				entries.add(dto);
			}
		}
		
		return entries;
	}

	@Override
	public EntaryDTO saveEntary(Entry entry) throws EntaryException {
		// TODO Auto-generated method stub
		return null;
	}

}
