package com.example.datn_fpoly.service.impl;

import com.example.datn_fpoly.entity.NhanVien;
import com.example.datn_fpoly.repository.NhanVienRepository;
import com.example.datn_fpoly.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepo;

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepo.findAll();
    }

    @Override
    public NhanVien add(NhanVien nhanVien) {
        return nhanVienRepo.save(nhanVien);
    }

    @Override
    public Boolean delete(UUID id) {
        nhanVienRepo.deleteById(id);
        return true;
    }

    @Override
    public NhanVien update(UUID id, NhanVien nhanVien) {
        return nhanVienRepo.save(nhanVien);
    }

    @Override
    public NhanVien detail(UUID id) {
        return nhanVienRepo.findById(id).orElse(null);
    }

}
