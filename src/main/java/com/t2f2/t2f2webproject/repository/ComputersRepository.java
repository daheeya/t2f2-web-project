package com.t2f2.t2f2webproject.repository;

import com.t2f2.t2f2webproject.entity.ComputersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputersRepository extends JpaRepository<ComputersEntity, Integer> {
}
