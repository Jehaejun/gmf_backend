package com.example.gmf.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="DEPT_LDGR")
public class DeptLdgr {
	@Id
	@Column(name = "DEPT_CODE", length = 10, nullable = false)
	private String deptCode;
	
	@Column(name = "DEPT_NAME", length = 10, nullable = false)
	private String deptName;
	
	@Column(name = "PRT_DEPT_CODE", length = 10, nullable = true)
	private String prtDeptCode;
	
	@ManyToOne
    @JoinColumn(name = "COMP_CODE", referencedColumnName = "COMP_CODE", updatable = false, nullable = false)
	private CompLdgr compLdgr;

}
