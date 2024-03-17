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
@Table(name = "gio_hang")
@Data
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    private Date ngay_tao;
    private  Date ngay_cap_nhat;
    private String ghi_chu;
    private  Integer trangthai;
    @ManyToOne
    @JoinColumn(name = "id_gio_hang_chi_tiet", referencedColumnName = "id")
    private GioHangChiTiet gioHangChiTiet;


}
