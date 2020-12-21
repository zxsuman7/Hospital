package com.project.Hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Hospital.entity.CategoryDetail;
import com.project.Hospital.repository.CategoryDetailRepo;

@Service
public class CategoryDetailService {
@Autowired
CategoryDetailRepo categorydetail;
public List<CategoryDetail> getAllCategoryDetail(){
	return categorydetail.findAll();
}
public List<CategoryDetail> saveCategoryDetail(List<CategoryDetail> cd){
	return categorydetail.saveAll(cd);
}
public CategoryDetail save(CategoryDetail cd)
{
	return categorydetail.save(cd);
}
public List<CategoryDetail> findByFirstNameLetter(){
	return categorydetail.findByFirstLetter();
}
public int countByName(){
	return categorydetail.countByName();
}
public int countByAddress(String address) {
	return categorydetail.countByAddress(address);
}
public List<CategoryDetail> findByAddress(String address){
	return categorydetail.findByAddress(address);
}

}
