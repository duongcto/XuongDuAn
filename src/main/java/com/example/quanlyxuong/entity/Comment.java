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
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comment", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "noi_dung", length = 100)
    private String noiDung;

    @Column(name = "ngay_binh_luan")
    private LocalDate ngayBinhLuan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nguoi_dung")
    private NguoiDung idNguoiDung;

}