package com.t2f2.t2f2webproject.repository;

import com.t2f2.t2f2webproject.entity.USBDevicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface USBDevicesRepository extends JpaRepository<USBDevicesEntity, Integer> {
    // 직원 ID를 기준으로 등록된 USB 기기 조회
    List<USBDevicesEntity> findByEmployeeIdx(Integer employeeIdx);

    // 특정 시리얼 넘버로 USB 기기 조회
    USBDevicesEntity findBySerialNumber(String serialNumber);
}
