package com.t2f2.t2f2webproject.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
public class EmployeesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "computer_idx")
    private ComputersEntity computersEntity;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "id", nullable = false, unique = true)
    private String employeeId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}