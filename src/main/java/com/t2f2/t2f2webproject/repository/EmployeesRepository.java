package com.t2f2.t2f2webproject.repository;

import com.t2f2.t2f2webproject.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<EmployeesEntity, Integer> {

}
