package com.t2f2.t2f2webproject.repository;

import com.t2f2.t2f2webproject.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<EmployeesEntity, Integer> {
    // 특정 팀에 속한 직원 목록 조회
    List<EmployeesEntity> findByTeamName(String teamName);

    // 이름과 ID로 직원 검색
    EmployeesEntity findByNameAndId(String name);
}
