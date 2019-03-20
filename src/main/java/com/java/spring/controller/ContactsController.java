package com.java.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.model.contacts;
import com.java.spring.service.ContactsService;

@RestController
public class ContactsController {
	
	@Autowired
	private ContactsService service;
	 
	@PostMapping("/contact") 
	public void addContact(@RequestBody contacts contact)
	{
		service.addContact(contact);
	}
	
	/*@RequestMapping("/getContact")
	public ModelAndView getContact(@RequestParam int cid)
	{
		ModelAndView mv=new ModelAndView("showContact.jsp");
		contacts contact=repo.findById(cid).orElse(new contacts());
		mv.addObject(contact);
		return mv;
	}*/
	
	@RequestMapping("/contacts")
	@ResponseBody
	public List<contacts> getAllContacts()
	{
		return service.getAllContacts();
	}
	
	@GetMapping("/contact/{cid}") 
	public Optional<contacts> getById(@PathVariable("cid")int cid)
	{
		return service.getContact(cid);
	}
	
	@GetMapping("/contacts/name/{cname}") 
	public List<contacts> getByName(@PathVariable("cname")String cname)
	{
		return service.getContactByName(cname);
	}
	
	@DeleteMapping("/contact/{cid}")
	public void deleteContact(@PathVariable int cid)
	{
		service.deleteContact(cid);
	}
	
	@PutMapping("/contact")
	public contacts updateContact(@RequestBody contacts contact)
	{
		return service.updateContact(contact);
	}
	
	@GetMapping("/pageContacts")
	public Page<contacts> fetchByPage(Pageable page)
	{
		return service.fetchByPage(page);
	}
	
	@GetMapping("/sortContacts")
	public List<contacts> sortData(Sort sort)
	{
		return service.sortDataInAscendingOrder(sort);
	}

}
