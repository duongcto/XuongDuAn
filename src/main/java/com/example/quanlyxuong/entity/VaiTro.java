package com.example.quanlyxuong.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "vai_tro")
public class VaiTro {
    @Id
    @Column(name = "id_vai_tro", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "ma_vai_tro", length = 50)
    private String maVaiTro;

    @Size(max = 100)
    @Nationalized
    @Column(name = "ten_vai_tro", length = 100)
    private String tenVaiTro;

    @Size(max = 255)
    @Nationalized
    @Column(name = "mo_ta")
    private String moTa;

}