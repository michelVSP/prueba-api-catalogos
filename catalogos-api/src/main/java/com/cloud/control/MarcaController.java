package com.cloud.control;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.entity.Marca;
import com.cloud.servcio.MarcaService;

@RestController
@RequestMapping(path = "/api/v1/marcas")
@CrossOrigin(origins = "http://localhost:5173")
public class MarcaController 
{
	private final MarcaService service;
	
	public MarcaController(MarcaService service) 
	{
		this.service = service;
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Marca>> getMarcas()
	{
		return service.buscaMarcasActivas();
	}
}
