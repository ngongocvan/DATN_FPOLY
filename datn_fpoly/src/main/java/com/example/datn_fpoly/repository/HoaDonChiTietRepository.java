package com.example.datn_fpoly.repository;

import com.example.datn_fpoly.entity.HoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, UUID > {
}
