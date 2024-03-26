package com.example.datn_fpoly.service;

import com.example.datn_fpoly.entity.KhachHang;
import com.example.datn_fpoly.entity.NhanVien;

import java.util.List;
import java.util.UUID;

public interface KhachHangService {
    List<KhachHang> getAll();

    KhachHang add(KhachHang khachHang);

    Boolean delete(UUID id);

    KhachHang update(UUID id, KhachHang khachHang);

    KhachHang detail(UUID id);
}
