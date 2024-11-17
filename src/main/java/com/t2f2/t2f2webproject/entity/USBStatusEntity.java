package com.t2f2.t2f2webproject.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "usb_status")
public class USBStatusEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usb_idx", nullable = false)
    private USBDevicesEntity usbDevicesEntity;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private USBStatusType status;

    @Id
    @Column(name = "status_time", nullable = false)
    private LocalDateTime statusTime;
}