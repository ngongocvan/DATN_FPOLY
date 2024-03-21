package com.example.datn_fpoly.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dep")
@Data
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    private String ten;
    private String mota;
    private Integer gia_nhap;
    private Integer gia_ban;
    private Integer trang_thai;
    private String gia_sau_khuyen_mai;
    private Date ngay_nhap;
    private Integer do_hot;
}
