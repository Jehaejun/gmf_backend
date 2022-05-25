package com.example.gmf.user;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COMP_LDGR")
public class CompLdgr {

	@Id
	@Column(name = "COMP_CODE", length = 10, nullable = false)
	private String compCode;
	
	@Column(name = "COMP_NAME", length = 20, nullable = false)
	private String compName;
}
