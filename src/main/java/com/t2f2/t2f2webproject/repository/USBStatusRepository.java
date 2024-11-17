package com.t2f2.t2f2webproject.repository;

import com.t2f2.t2f2webproject.entity.USBStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface USBStatusRepository extends JpaRepository<USBStatusEntity,Integer> {
    List<USBStatusEntity> findByUsbIdxAndStatus(Integer usbIdx, String status);
}
