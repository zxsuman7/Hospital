package com.project.Hospital.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Hospital.entity.CategoryType;

public interface CategoryTypeRepo extends JpaRepository<CategoryType, Integer> {

}
