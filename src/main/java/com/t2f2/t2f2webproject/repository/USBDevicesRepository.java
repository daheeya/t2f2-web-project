package com.t2f2.t2f2webproject.repository;

import com.t2f2.t2f2webproject.entity.USBDevicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface USBDevicesRepository extends JpaRepository<USBDevicesEntity, Integer> {

}
