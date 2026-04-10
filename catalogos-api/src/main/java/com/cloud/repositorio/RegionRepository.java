package com.cloud.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.entity.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer>
{
	List<Region> findByStatus(Integer status);
}
