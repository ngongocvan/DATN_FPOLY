package com.example.datn_fpoly.service.impl;

import com.example.datn_fpoly.entity.SanPham;
import com.example.datn_fpoly.repository.SanPhamRepository;
import com.example.datn_fpoly.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    private SanPhamRepository sanphamRepository;
    @Override
    public List<SanPham> getAll() {
        return sanphamRepository.findAll();
    }

    @Override
    public SanPham add(SanPham sanPham) {
        return sanphamRepository.save(sanPham);
    }

    @Override
    public Boolean delete(UUID id) {
        sanphamRepository.deleteById(id);
        return true;
    }

    @Override
    public SanPham update(UUID id, SanPham sanPham) {
        return sanphamRepository.save(sanPham);
    }

    @Override
    public SanPham detaill(UUID id) {
        return sanphamRepository.findById(id).orElse(null);
    }
}
