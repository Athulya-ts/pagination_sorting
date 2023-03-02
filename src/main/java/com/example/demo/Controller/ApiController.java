
package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Child;

import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	

	@Autowired
	ApiService serv;
	@GetMapping("/showDetails")
	public List<Child> showDetails(){
		return serv.getDetails();
	}
	@PutMapping("/updateDetails")
	public Child updateDetail(@RequestBody Child s)
	{
		return serv.updateDetails(s);
	}
	@PostMapping("/addDetails")
	public Child addDetails(@RequestBody Child st)
	{
		return serv.postDetails(st);
	}
	@DeleteMapping("/delete/{sid}")
	public String deleteDetail(@PathVariable("sid")int sid) {
		return serv.deleteDetails(sid);
	}
	//sorting
			@GetMapping("/product/{field}")
			public List<Child> getWithSort(@PathVariable String field) {
				return serv.getSorted(field);
			}

			// pagination
			@GetMapping("/product/{offset}/{pageSize}")
			public List<Child> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
				return serv.getWithPagination(offset, pageSize);
			}
}