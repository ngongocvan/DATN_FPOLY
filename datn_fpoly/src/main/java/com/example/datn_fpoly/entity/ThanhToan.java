package com.example.datn_fpoly.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "thanh_toan")
@Data

public class ThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String hinh_thuc_thanh_toan;
    private Integer trang_thai;
}
