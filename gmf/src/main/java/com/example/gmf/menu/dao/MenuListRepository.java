package com.example.gmf.menu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gmf.menu.entity.MenuList;

@Repository
public interface MenuListRepository extends JpaRepository<MenuList, Long> {

}
