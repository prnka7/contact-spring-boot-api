package com.java.spring.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.java.spring.model.contacts;

public interface contactDAO extends JpaRepository<contacts, Integer> ,PagingAndSortingRepository<contacts,Integer >{

	List<contacts> findBycname(String cname);
	Page<contacts> findAll(Pageable pageable);
	List<contacts> findAll(Sort sort);
	
}
