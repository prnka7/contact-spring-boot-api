package com.java.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.java.spring.dao.contactDAO;
import com.java.spring.model.contacts;

@Service
public class ContactsService {

	@Autowired
	private contactDAO repo;

	public void addContact(contacts contact) {
		repo.save(contact);
	}

	public Optional<contacts> getContact(int cid) {
		return repo.findById(cid);
	}

	public List<contacts> getContactByName(String cname) {
		return repo.findBycname(cname);
	}

	public void deleteContact(int cid) {
		repo.deleteById(cid);
	}

	public contacts updateContact(contacts contact) {
		
		repo.save(contact);
		return contact;
	}

	public List<contacts> getAllContacts() {
		List<contacts> contact=new ArrayList<>();
		repo.findAll()
		.forEach(contact::add);
		return contact;
		
	}

	public Page<contacts> fetchByPage(Pageable page) {
		return repo.findAll(page);
	}

	public List<contacts> sortDataInAscendingOrder(Sort sort){
		return repo.findAll(sort);
	}

}

