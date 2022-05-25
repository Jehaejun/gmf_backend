package com.example.gmf.menu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="MENU_LIST")
@IdClass(MenuListId.class)
public class MenuList {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
    @JoinColumn(name = "ORDER_KEY", referencedColumnName = "ORDER_KEY", updatable = false, nullable = false)
	private MenuOrderMstr menuOrderMstr;
	
	/*
	 * @Id
	 * 
	 * @Column(name = "ORDER_KEY", length = 20, nullable = false) private String
	 * userId;
	 */
	@Id
	@Column(name = "MENU_SEQ", length = 10, nullable = false)
	private String menuSeq;
	
	@Column(name = "MENU_NAME", length = 10, nullable = false)
	private String menuName;
	
	@Column(name = "MENU_PRICE", length = 7, nullable = false)
	private long menuPrice;
	
	
	
}
/**
`ORDER_KEY` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MENU_SEQ` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MENU_NAME` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MENU_PRICE` int(7) NOT NULL,
*/