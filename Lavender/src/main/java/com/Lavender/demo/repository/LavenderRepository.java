package com.Lavender.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Lavender.demo.Model.LavenderModel;


@Repository
public interface LavenderRepository extends JpaRepository<LavenderModel,Integer>{
	public List<LavenderModel>findByBrandnameStartingWith(String prefix);
	public List<LavenderModel>findByBrandnameEndingWith(String suffix);
	public List<LavenderModel>findBySize(int size);
	
	


}
