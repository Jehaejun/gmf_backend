package com.example.gmf.menu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.gmf.user.UserLdgr;

import lombok.Data;

@Data
@Entity
@Table(name="MENU_ORDER_MSTR")
public class MenuOrderMstr {
	@Id
	@Column(name = "ORDER_KEY", length = 20, nullable = false)
	private String orderKey;
	
	@Column(name = "BIZ_NM", length = 20, nullable = false)
	private String bizNm;
	
	@Column(name = "ORDER_DATE", length = 8, nullable = false)
	private String orderDate;
	
	@Column(name = "ORDER_TYPE", length = 1, nullable = false)
	private String orderType;
	
	@Column(name = "CONT", length = 100, nullable = false)
	private String cont;
	
	@Column(name = "IMG_PATH", length = 50, nullable = false)
	private String imgPath;
	
	@ManyToOne
    @JoinColumn(name = "USER_CODE", referencedColumnName = "USER_CODE", updatable = false, nullable = false)
	private UserLdgr userLdgr;
}
