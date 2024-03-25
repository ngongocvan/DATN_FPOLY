package com.example.datn_fpoly.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hoa_don_chi_tiet")
@Data
public class HoaDonChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ten_nguoi_nhan;
    private String sdt_nguoi_nhan;
    private String dia_chi;
    private Integer tong_tien;
    private Integer hinh_thuc_mua;
    private Integer hinh_thuc_thanh_toan;
    private Integer phi_ship;
    private Integer so_luong;
    private Integer gia_nhap;
    private Integer don_gia;
    private Integer trang_thai;

    @ManyToOne
    @JoinColumn(name = "id_hoa_don", referencedColumnName = "id")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "id_gio_hang", referencedColumnName = "id")
    private GioHang gioHang;


}
