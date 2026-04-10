package com.cloud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MARCA", schema = "GENERAL")
@Data
@NoArgsConstructor
public class Marca 
{
	@Id
	@Column(name = "MARCA_ID")
	private Integer marcaId;
	
	@Column(name = "NOMBMARCA")
	private String nombMarca;
	
	@Column(name = "CVEMARCA")	
	private String cveMarca;
	
	@Column(name = "STATUS")
	private Integer status;
}
