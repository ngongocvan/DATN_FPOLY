package com.example.datn_fpoly.service.impl;

import com.example.datn_fpoly.entity.HoaDon;
import com.example.datn_fpoly.entity.NhanVien;
import com.example.datn_fpoly.repository.HoaDonRepository;
import com.example.datn_fpoly.repository.NhanVienRepository;
import com.example.datn_fpoly.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Override
    public List<HoaDon> getAll() {
        return hoaDonRepository.findAll();
    }

    @Override
    public HoaDon add(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public Boolean delete(UUID id) {
        hoaDonRepository.deleteById(id);
        return true;
    }

    @Override
    public HoaDon update(UUID id, HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public HoaDon detail(UUID id) {
        return hoaDonRepository.findById(id).orElse(null);
    }

}
