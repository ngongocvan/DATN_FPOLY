package com.example.datn_fpoly.repository;

import com.example.datn_fpoly.entity.KhachHang;
import com.example.datn_fpoly.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface KhachHangRepository extends JpaRepository<KhachHang, UUID>{
}
