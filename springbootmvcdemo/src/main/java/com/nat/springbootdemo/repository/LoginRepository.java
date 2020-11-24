package com.nat.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nat.springbootdemo.model.Login;



@Repository
public interface LoginRepository extends JpaRepository<Login, String> {

}
