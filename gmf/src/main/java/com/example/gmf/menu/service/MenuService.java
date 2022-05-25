package com.example.gmf.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.gmf.menu.dao.MenuListRepository;
import com.example.gmf.menu.dao.MenuOrderMstrRepository;
import com.example.gmf.menu.entity.MenuOrderMstr;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)  // JPA 데이터 변경 처리는 반드시 transaction 안에서 처리한다.
@RequiredArgsConstructor
public class MenuService {

	/*
	 * @Autowired private MenuListRepository menuListRepository;
	 * 
	 * @Autowired private MenuApyHstrRepository menuApyHstrRepository;
	 * 
	 * @Autowired private MenuMemberRepository menuMemberRepository;
	 */

	@Autowired 
	private MenuListRepository menuListRepository;
	 
	@Autowired
	private MenuOrderMstrRepository menuOrderMstrRepository;

	/*
	 * @Transactional public ResponseEntity<MenuOrderMstr> save () { MenuOrderMstr
	 * menuOrderMstr = new MenuOrderMstr();
	 * 
	 * //return
	 * ResponseEntity.ok().body(menuOrderMstrRepository.save(menuOrderMstr));
	 * //return ResponseEntity.ok(null); }
	 */
	public ResponseEntity<List<MenuOrderMstr>> select() {
		List<MenuOrderMstr> rec = menuOrderMstrRepository.findAll(Sort.by(Direction.DESC, "orderDate"));
		return new ResponseEntity<List<MenuOrderMstr>>(rec, HttpStatus.OK);
	}

}
