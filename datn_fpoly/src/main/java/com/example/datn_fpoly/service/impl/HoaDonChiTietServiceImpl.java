package com.example.datn_fpoly.service.impl;

import com.example.datn_fpoly.entity.HoaDon;
import com.example.datn_fpoly.entity.HoaDonChiTiet;
import com.example.datn_fpoly.repository.HoaDonChiTietRepository;
import com.example.datn_fpoly.repository.HoaDonRepository;
import com.example.datn_fpoly.service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {
    @Autowired
    private HoaDonChiTietRepository hoaDonChiTietRepository;

    @Override
    public List<HoaDonChiTiet> getAll() {
        return hoaDonChiTietRepository.findAll();
    }

    @Override
    public HoaDonChiTiet add(HoaDonChiTiet hoaDonChiTiet) {
        return hoaDonChiTietRepository.save(hoaDonChiTiet);
    }

    @Override
    public Boolean delete(UUID id) {
        hoaDonChiTietRepository.deleteById(id);
        return true;
    }

    @Override
    public HoaDonChiTiet update(UUID id, HoaDonChiTiet  hoaDonChiTiet) {
        return hoaDonChiTietRepository.save(hoaDonChiTiet);
    }

    @Override
    public HoaDonChiTiet detail(UUID id) {
        return hoaDonChiTietRepository.findById(id).orElse(null);
    }
}
