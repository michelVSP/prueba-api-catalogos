package com.cloud.servcio;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cloud.entity.Marca;
import com.cloud.repositorio.MarcaRepository;

@Service
public class MarcaService 
{
	private MarcaRepository repo;
	
	public MarcaService(MarcaRepository repo) 
	{
		this.repo = repo;
	}
	
	public ResponseEntity<List<Marca>> buscaMarcasActivas()
	{
		List<Marca> lst = repo.findByStatus(1);
		
		if(lst.isEmpty())
			return new ResponseEntity<List<Marca>>(lst, HttpStatus.NOT_FOUND);
	
		return new ResponseEntity<List<Marca>>(lst, HttpStatus.OK);
	}
}
