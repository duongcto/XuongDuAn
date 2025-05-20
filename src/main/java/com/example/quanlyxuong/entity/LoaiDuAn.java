package com.example.quanlyxuong.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "loai_du_an")
public class LoaiDuAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_loai_du_an", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "ten_loai_du_an", length = 100)
    private String tenLoaiDuAn;

    @Size(max = 255)
    @Nationalized
    @Column(name = "mo_ta")
    private String moTa;

}