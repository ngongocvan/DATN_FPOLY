package com.example.datn_fpoly.service;

import com.example.datn_fpoly.entity.HoaDon;
import com.example.datn_fpoly.entity.HoaDonChiTiet;

import java.util.List;
import java.util.UUID;

public interface HoaDonChiTietService {
    List<HoaDonChiTiet> getAll();

    HoaDonChiTiet add(HoaDonChiTiet hoaDonChiTiet);

    Boolean delete(UUID id);

    HoaDonChiTiet update(UUID id, HoaDonChiTiet hoaDonChiTiet);

    HoaDonChiTiet detail(UUID id);
}

