package com.example.gmf.menu.entity;

import java.awt.Menu;
import java.io.Serializable;
import lombok.Data;

@Data
public class MenuApyHstrId implements Serializable {
	private static final long serialVersionUID = 1L;
	
//	private String menuOrderMstr;
//	private String userLdgr;
	//private String menuList;
	private MenuList menuList;
	
	private int seq;
	
	public MenuApyHstrId() {

	}

	public MenuApyHstrId(/* String menuOrderMstr, *//* String userLdgr, */ MenuList menuList, int seq) {
	//	this.menuOrderMstr = menuOrderMstr;
	//	this.userLdgr = userLdgr;
		this.menuList = menuList;
		this.seq = seq;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
