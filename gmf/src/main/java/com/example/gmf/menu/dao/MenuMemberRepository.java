package com.example.gmf.menu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gmf.menu.entity.MenuMember;

public interface MenuMemberRepository extends JpaRepository<MenuMember, Long> {

}
