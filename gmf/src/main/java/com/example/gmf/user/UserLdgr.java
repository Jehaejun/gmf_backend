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
@Table(name="USER_LDGR")
public class UserLdgr {
	@Id
	@Column(name = "USER_CODE", length = 10, nullable = false)
	private String userCode;
	
	@Column(name = "USER_NAME", length = 15, nullable = false)
	private String userName;
	
		
	@Column(name = "DVC_TOKEN", length = 300, nullable = true)
	private String dvcToken;
	
	@Column(name = "REG_DTM", length = 20, nullable = false)
	private String regDtm;
	
	
	@ManyToOne
    @JoinColumn(name = "COMP_CODE", referencedColumnName = "COMP_CODE", updatable = false, nullable = false)
	private CompLdgr compLdgr;

	@ManyToOne
    @JoinColumn(name = "DEPT_CODE", referencedColumnName = "DEPT_CODE", updatable = false, nullable = false)
	private DeptLdgr deptLdgr;

	

	/**
	 * `USER_CODE` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '사용자 코드',
  `USER_NAME` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `COMP_CODE` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '회사코드',
  `DEPT_CODE` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '부서코드',
  `DVC_TOKEN` varchar(300) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '디바이스 토큰',
  `REG_DTM` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`USER_CODE`),
  KEY `FK_user_ldgr_comp_ldgr` (`COMP_CODE`),
  KEY `FK_user_ldgr_dept_ldgr` (`DEPT_CODE`),
  CONSTRAINT `FK_user_ldgr_comp_ldgr` FOREIGN KEY (`COMP_CODE`) REFERENCES `comp_ldgr` (`COMP_CODE`),
  CONSTRAINT `FK_user_ldgr_dept_ldgr` FOREIGN KEY (`DEPT_CODE`) REFERENCES `dept_ldgr` (`DEPT_CODE`)
	 */
}
