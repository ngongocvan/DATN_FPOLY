package com.example.datn_fpoly.service;



import com.example.datn_fpoly.entity.SanPham;

import java.util.List;
import java.util.UUID;

public interface SanPhamService {
    List<SanPham> getAll();
    SanPham add(SanPham sanPham);
    Boolean delete(UUID id);
    SanPham update(UUID id, SanPham sanPham);
    SanPham detaill(UUID id);
}
