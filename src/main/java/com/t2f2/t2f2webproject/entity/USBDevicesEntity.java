package com.t2f2.t2f2webproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usb_devices")
public class USBDevicesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @Column(name = "computer_name", nullable = false)
    private String computerName;

    @Column(name = "device_id", nullable = false, unique = true)
    private String deviceId;

    @Column(name = "serial_number", nullable = false)
    private String serialNumber;

    @Column(name = "model")
    private String model;

    @Column(name = "request_time")
    private LocalDateTime requestTime;

    @OneToMany(mappedBy = "usbDevice", fetch = FetchType.LAZY)
    private List<USBStatusEntity> statusEntities;

    @OneToMany(mappedBy = "usbDevice", fetch = FetchType.LAZY)
    private List<FileMovementsEntity> fileMovementsEntities;
}