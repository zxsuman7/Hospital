package com.project.Hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Hospital.entity.CategoryType;
import com.project.Hospital.repository.CategoryTypeRepo;

@Service
public class CategoryTypeService {
@Autowired
CategoryTypeRepo ctr;
public List<CategoryType> getAllCatgoryType(){
	return ctr.findAll();
}
public CategoryType saveCategoryType(CategoryType c){
	return ctr.save(c);
}
}
