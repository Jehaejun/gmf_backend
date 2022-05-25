package com.example.gmf.menu.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.gmf.user.UserLdgr;

import lombok.Data;

@Data
@Entity
@Table(name="MENU_MEMBER")
@IdClass(MenuMemberId.class)
public class MenuMember implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
    @JoinColumn(name = "ORDER_KEY", referencedColumnName = "ORDER_KEY", updatable = false, nullable = false)
	private MenuOrderMstr menuOrderMstr;
	
	@Id
	@ManyToOne
    @JoinColumn(name = "USER_CODE", referencedColumnName = "USER_CODE", updatable = false, nullable = false)
	private UserLdgr userLdgr;
}
