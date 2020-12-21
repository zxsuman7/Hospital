package com.project.Hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.Hospital.entity.CategoryDetail;

public interface CategoryDetailRepo extends JpaRepository<CategoryDetail, Integer> {
	@Query("SELECT c FROM CategoryDetail c WHERE c.name LIKE'D%'")
	List<CategoryDetail> findByFirstLetter();
	@Query("SELECT COUNT(name) FROM CategoryDetail c WHERE c.name LIKE 'D%'")
	int countByName();
	@Query("SELECT COUNT(address) FROM CategoryDetail c WHERE c.address=?1")
	int countByAddress(String address);
	@Query("SELECT c FROM CategoryDetail c where c.address=?1")
	List<CategoryDetail> findByAddress(String address);

}
