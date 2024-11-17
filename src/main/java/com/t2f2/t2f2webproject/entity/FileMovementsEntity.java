package com.t2f2.t2f2webproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "file_movements")
public class FileMovementsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "computer_idx", nullable = false)
    private ComputersEntity computersEntity;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "source_path")
    private String sourcePath;

    @Column(name = "destination_path")
    private String destinationPath;

    @Column(name = "move_time", nullable = false)
    private LocalDateTime moveTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usb_idx")
    private USBDevicesEntity usbDevice;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}