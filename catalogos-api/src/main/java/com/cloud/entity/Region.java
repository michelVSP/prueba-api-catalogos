package com.cloud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "REGION", schema = "GENERAL")
@Data
@NoArgsConstructor
public class Region 
{
	@Id
	@Column(name = "REGION_ID")
	private Integer regionId;
	
	@Column(name = "NOMBREGION")
	private String nombRegion;
	
	@Column(name = "CVEREGION")	
	private String cveReg;
	
	@Column(name = "STATUS")
	private Integer status;
}
