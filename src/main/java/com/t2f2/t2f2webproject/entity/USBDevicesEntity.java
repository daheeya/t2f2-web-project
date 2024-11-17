package com.t2f2.t2f2webproject.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "usb_devices")
public class USBDevicesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_idx")
    private EmployeesEntity employee;

    @Column(name = "device_id", nullable = false, unique = true)
    private String deviceId;

    @Column(name = "serial_number", nullable = false)
    private String serialNumber;

    @Column(name = "model")
    private String model;

    @Column(name = "request_time")
    private LocalDateTime requestTime;

    @OneToMany(mappedBy = "usbDevicesEntity", fetch = FetchType.LAZY)
    private List<USBStatusEntity> statusEntities;
}