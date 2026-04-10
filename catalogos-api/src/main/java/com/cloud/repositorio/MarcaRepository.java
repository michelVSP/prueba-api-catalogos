package com.cloud.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.entity.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer>
{
	List<Marca> findByStatus(Integer status);
}
