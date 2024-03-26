package com.example.datn_fpoly.service.impl;

import com.example.datn_fpoly.entity.KhachHang;
import com.example.datn_fpoly.entity.NhanVien;
import com.example.datn_fpoly.repository.KhachHangRepository;
import com.example.datn_fpoly.repository.NhanVienRepository;
import com.example.datn_fpoly.service.KhachHangService;
import com.example.datn_fpoly.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepos;

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepos.findAll();
    }

    @Override
    public KhachHang add(KhachHang khachHang) {
        return khachHangRepos.save(khachHang);
    }

    @Override
    public Boolean delete(UUID id) {
        khachHangRepos.deleteById(id);
        return true;
    }

    @Override
    public KhachHang update(UUID id, KhachHang khachHang) {
        return khachHangRepos.save(khachHang);
    }

    @Override
    public KhachHang detail(UUID id) {
        return khachHangRepos.findById(id).orElse(null);
    }
}
