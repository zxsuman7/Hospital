package com.project.Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Hospital.entity.CategoryType;
import com.project.Hospital.service.CategoryTypeService;

@RestController
public class CategoryTypeController {
	@Autowired
	CategoryTypeService cts;
	@GetMapping("/categorytype")
	public List<CategoryType> getAllCategoryType(){
		return cts.getAllCatgoryType();
	}
	@PostMapping("/savetype")
	public CategoryType save(@RequestBody CategoryType ct) {
		return cts.saveCategoryType(ct);
	}
}
