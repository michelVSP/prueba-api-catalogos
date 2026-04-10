package com.cloud.servcio;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cloud.entity.Region;
import com.cloud.repositorio.RegionRepository;

@Service
public class RegionService 
{
	private RegionRepository repo;
	
	public RegionService(RegionRepository repo) 
	{
		this.repo = repo;
	}
	
	public ResponseEntity<List<Region>> buscaRegionesActivas() 
	{
		List<Region> lst = repo.findByStatus(1);
		
		if(lst.isEmpty())
			return new ResponseEntity<List<Region>>(lst, HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Region>>(lst, HttpStatus.OK);
	}

}
