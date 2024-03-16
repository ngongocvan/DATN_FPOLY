package com.example.datn_fpoly.service;

import com.example.datn_fpoly.entity.NhanVien;

import java.util.List;
import java.util.UUID;

public interface NhanVienService {
    List<NhanVien> getAll();

    NhanVien add(NhanVien nhanVien);

    Boolean delete(UUID id);

    NhanVien update(UUID id, NhanVien nhanVien);

    NhanVien detail(UUID id);
}
