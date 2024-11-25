package com.t2f2.t2f2webproject.repository;

import com.t2f2.t2f2webproject.dto.SortType;
import com.t2f2.t2f2webproject.entity.FileMovementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FileMovementsRepository extends JpaRepository<FileMovementsEntity, Long> {

    @Query("SELECT f FROM FileMovement f WHERE " +
            "(:startDate IS NULL OR f.moveTime >= :startDate) AND " +
            "(:endDate IS NULL OR f.moveTime <= :endDate) AND " +
            "(:employee IS NULL OR f.employee LIKE CONCAT('%', :employee, '%')) AND " +
            "(:file IS NULL OR f.fileName LIKE CONCAT('%', :file, '%')) " +
            "ORDER BY CASE WHEN :sort = 'ASC' THEN f.moveTime END ASC")
    List<FileMovementsEntity> findFileMovements(@Param("startDate") String startDate,
                                         @Param("endDate") String endDate,
                                         @Param("employee") String employee,
                                         @Param("file") String file,
                                         @Param("sort") SortType sort);
}