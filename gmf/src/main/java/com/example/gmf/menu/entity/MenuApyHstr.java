package com.example.gmf.menu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.gmf.user.UserLdgr;

import lombok.Data;

@Data
@Entity
@Table(name="MENU_APY_HSTR")
@IdClass(MenuApyHstrId.class)
public class MenuApyHstr implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "ORDER_KEY", referencedColumnName = "ORDER_KEY", updatable = false, nullable = false),
		@JoinColumn(name = "MENU_SEQ", referencedColumnName = "MENU_SEQ", updatable = false, nullable = false)
	})
	private MenuList menuList;
	
	/*
	 * @Id
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "MENU_SEQ", referencedColumnName = "MENU_SEQ", updatable =
	 * false, nullable = false) private MenuList menuList;
	 */
	
	@Id
	@Column(name = "SEQ", length = 3, nullable = false)
	private int seq;
	
	@ManyToOne
    @JoinColumn(name = "USER_CODE", referencedColumnName = "USER_CODE", updatable = false, nullable = false)
	private UserLdgr userLdgr;
	
	/*
	 * `ORDER_KEY` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL, `MENU_SEQ`
	 * varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL, `SEQ` int(3) NOT NULL,
	 * `USER_CODE` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL, PRIMARY KEY
	 * (`ORDER_KEY`,`MENU_SEQ`,`SEQ`),
	 */
	
	
}
