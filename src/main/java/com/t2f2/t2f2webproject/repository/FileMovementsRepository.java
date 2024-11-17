package com.t2f2.t2f2webproject.repository;

import com.t2f2.t2f2webproject.entity.FileMovementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FileMovementsRepository extends JpaRepository<FileMovementsEntity, Integer> {
    // 특정 컴퓨터에서 발생한 파일 이동 조회
    List<FileMovementsEntity> findByComputersEntityIdx(Integer computerIdx);

    // 특정 시간대에 발생한 파일 이동 조회
    List<FileMovementsEntity> findByMoveTimeBetween(LocalDateTime start, LocalDateTime end);
}
