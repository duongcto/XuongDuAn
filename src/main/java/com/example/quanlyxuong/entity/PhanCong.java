package com.example.quanlyxuong.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "phan_cong")
public class PhanCong {

    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_danh_sach_cong_viec", nullable = false)
    private DanhSachCongViec idDanhSachCongViec;

    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_nguoi_dung", nullable = false)
    private NguoiDung idNguoiDung;

    @Column(name = "ngay_phan_cong")
    private LocalDate ngayPhanCong;

}