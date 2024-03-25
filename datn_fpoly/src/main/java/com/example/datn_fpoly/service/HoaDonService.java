package com.example.datn_fpoly.service;

import com.example.datn_fpoly.entity.HoaDon;
import com.example.datn_fpoly.entity.NhanVien;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface HoaDonService {
    List<HoaDon> getAll();

    HoaDon add(HoaDon hoaDon);

    Boolean delete(UUID id);

    HoaDon update(UUID id, HoaDon hoaDon);

    HoaDon detail(UUID id);
}
