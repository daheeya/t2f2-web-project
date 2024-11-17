package com.t2f2.t2f2webproject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "computers")
public class ComputersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @Column(name = "computer_name", nullable = false)
    private String computerName;

    @OneToOne(mappedBy = "computersEntity",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_idx")
    private EmployeesEntity user;

    @OneToMany(mappedBy = "computersEntity",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FileMovementsEntity> fileMovements;
}