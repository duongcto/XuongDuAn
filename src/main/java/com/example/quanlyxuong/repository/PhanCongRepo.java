package com.example.quanlyxuong.repository;

import com.example.quanlyxuong.entity.PhanCong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhanCongRepo extends JpaRepository<PhanCong, Integer> {
}
