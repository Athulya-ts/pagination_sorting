package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Child;
import com.example.demo.Repository.ChildRepo;

@Service
public class ApiService {
	@Autowired
	ChildRepo stRepo;
	public Child updateDetails(Child en) {
		return stRepo.saveAndFlush(en);
	}
	public String deleteDetails(int id) {
		stRepo.deleteById(id); 
	return "Deleted details";
	}
	public Child postDetails(Child e) {
		return stRepo.save(e);
	}
	public List<Child> getDetails(){
		return stRepo.findAll();
	}
	public List<Child> getSorted(String field) {
		return stRepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<Child> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<Child> page =stRepo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
	
}