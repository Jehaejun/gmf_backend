package com.example.gmf.menu.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class MenuMemberId implements Serializable {
	private static final long serialVersionUID = 1L;

	private String menuOrderMstr;
	private String userLdgr;

	public MenuMemberId() {

	}

	public MenuMemberId(String menuOrderMstr, String userLdgr) {
		this.menuOrderMstr = menuOrderMstr;
		this.userLdgr = userLdgr;
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
