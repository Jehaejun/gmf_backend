package com.example.gmf.menu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
public class MenuListId implements Serializable {
	private static final long serialVersionUID = 1L;

	private String menuOrderMstr;

	private String menuSeq;
	
	public MenuListId() {
		
	}
	public MenuListId(String menuOrderMstr, String menuSeq) {
		this.menuOrderMstr = menuOrderMstr;
		this.menuSeq = menuSeq;
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
