package com.Lavender.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Lavender.demo.Model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Integer> {

	LoginModel findByusername(String username);
}
