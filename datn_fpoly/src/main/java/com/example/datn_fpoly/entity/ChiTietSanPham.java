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
@Table(name = "chi_tiet_dep")
@Data
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String mo_ta;
    private String trang_thai;
    private String mau_ma;
    private String thuong_hieu;
    private String chat_lieu;
    private String mau_sac;
    private String xuat_xu;
    private String kieu_dang;
    private String anh_san_pham;
    private Date ngay_nhap;
    private String gia_nhap;
    private String gia_ban;

}
