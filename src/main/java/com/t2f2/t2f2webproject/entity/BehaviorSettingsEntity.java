package com.t2f2.t2f2webproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "behavior_settings")
public class BehaviorSettingsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long settingId;

    @Column(name = "work_start_time", nullable = false)
    private LocalTime workStartTime;

    @Column(name = "work_end_time", nullable = false)
    private LocalTime workEndTime;

    @Column(name = "bulk_file_threshold", nullable = false)
    private int bulkFileThreshold;

    @Column(name = "bulk_file_time_frame", nullable = false)
    private int bulkFileTimeFrame;

    @Column(name = "frequent_file_threshold", nullable = false)
    private int frequentFileThreshold;

    @Column(name = "frequent_file_time_frame", nullable = false)
    private int frequentFileTimeFrame;

    @Column(name = "frequent_file_user_limit", nullable = false)
    private int frequentFileUserLimit;

    @Column(name = "retention_period_days", nullable = false)
    private int retentionPeriodDays;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}