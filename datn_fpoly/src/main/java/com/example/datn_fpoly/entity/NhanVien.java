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
@Table(name = "nhan_vien")
@Data

public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    private String ho_ten;
    private Date ngay_sinh;
    private String xa;
    private String huyen;
    private String thanh_pho;
    private String sdt;
    private String email;
    private String mat_khau;
    private Date ngay_vao_lam;
    private Date ngay_nghi_viec;
    private String trangthai;




}
