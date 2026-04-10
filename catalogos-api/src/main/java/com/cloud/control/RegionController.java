package com.cloud.control;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.entity.Region;
import com.cloud.servcio.RegionService;

@RestController
@RequestMapping(path = "/api/v1/regiones")
@CrossOrigin(origins = "http://localhost:5173")
public class RegionController
{
	private final RegionService service;
	
	public RegionController(RegionService service) 
	{
		this.service = service;
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Region>> getRegiones()
	{
		return service.buscaRegionesActivas();
	}
}
