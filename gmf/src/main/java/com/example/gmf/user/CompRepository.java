package com.example.gmf.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompRepository extends JpaRepository<CompLdgr, Long>{

}
