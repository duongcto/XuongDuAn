package com.example.quanlyxuong.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "bao_cao")
public class BaoCao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bao_cao", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nguoi_dung")
    private com.example.quanlyxuong.entity.NguoiDung idNguoiDung;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_du_an")
    private com.example.quanlyxuong.entity.DuAn idDuAn;

    @Column(name = "ngay_bao_cao")
    private LocalDate ngayBaoCao;

    @Column(name = "ngay_tao")
    private LocalDate ngayTao;

    @Column(name = "ngay_update")
    private LocalDate ngayUpdate;

    @Size(max = 255)
    @Nationalized
    @Column(name = "hom_nay_lam_gi")
    private String homNayLamGi;

    @Size(max = 255)
    @Nationalized
    @Column(name = "gap_kho_khan_gi")
    private String gapKhoKhanGi;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ngay_mai_lam_gi")
    private String ngayMaiLamGi;

    @Column(name = "thoi_gian")
    private Double thoiGian;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}