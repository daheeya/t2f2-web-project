package com.t2f2.t2f2webproject.repository;

import com.t2f2.t2f2webproject.entity.FileMovementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FileMovementsRepository extends JpaRepository<FileMovementsEntity, Integer> {

}
