package com.wipro.productmgmt.controller;
import java.util.List;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.productmgmt.Entity.Prod;
import com.wipro.productmgmt.Service.ProductService;

@Tag(name = "Tutorial", description = "Tutorial management APIs")

@Operation(summary = "Save a tourist place")
	  @ApiResponses(value = {
	    @ApiResponse(responseCode = "200", description = "Saved successfully"),
	    @ApiResponse(responseCode = "404", description = "Not found")
	  })
 
@RestController
@RequestMapping("/productdetails")
public class ProductController {
	@Autowired
	ProductService ProdService;
	
	@PostMapping
	void save(@RequestBody Prod product)
	{
		ProdService.save(product);
	}
	
	@GetMapping
	List<Prod> findAll()
	{
		return ProdService.findAll();
		
	}
	
	
	@GetMapping("/{id}")
	Prod findById(@PathVariable int id)
	{
		return ProdService.findById(id);
		
	}
	
	@PutMapping 
	void update(@RequestBody Prod product)
	{
		  ProdService.save(product);
		
	}
	
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		  ProdService.deleteById(id);
		
	}
}
