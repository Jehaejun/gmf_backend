package com.example.gmf.menu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gmf.menu.entity.MenuOrderMstr;

@Repository
public interface MenuOrderMstrRepository extends JpaRepository<MenuOrderMstr, Long> {

}
