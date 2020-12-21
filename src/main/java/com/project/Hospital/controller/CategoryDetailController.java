package com.project.Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Hospital.entity.CategoryDetail;
import com.project.Hospital.service.CategoryDetailService;

@RestController
public class CategoryDetailController {
	@Autowired
CategoryDetailService cds;
@GetMapping("/categorydetail")
private List<CategoryDetail> getAllCategoryDetail(){
return cds.getAllCategoryDetail();
}


@PostMapping("/saveallcategorydetail")
private List<CategoryDetail> saveCategoryDetail(@RequestBody List<CategoryDetail> cd){
	return cds.saveCategoryDetail(cd);
}

@PostMapping("/save")
private CategoryDetail save(@RequestBody CategoryDetail cd)
{
	return cds.save(cd);
}
@GetMapping("/findByFirstNameLetter")
private List<CategoryDetail> findByFirstName(){
	return cds.findByFirstNameLetter();
}
@GetMapping("/countByName")
private int countByName(){
	return cds.countByName();
}
@GetMapping("/countByAddress/{address}")
private int countByAddress(@PathVariable String address) {
	return cds.countByAddress(address);
}
@GetMapping("/findByAddress/{address}")
private List<CategoryDetail> findByAddress(@PathVariable String address){
	return cds.findByAddress(address);
}
}
