package com.example.quanlyxuong.repository;

import com.example.quanlyxuong.entity.ThongBao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThongBaoRepo extends JpaRepository<ThongBao, Integer> {
}
