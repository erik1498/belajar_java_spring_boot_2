package com.example.belajar_java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tahun_akademik_tab")
public class TahunAkademikEntity implements Serializable {
    @Id
    @Column(name = "uuid", updatable = false, nullable = false)
    private String uuid = UUID.randomUUID().toString();
    @Column(name = "ta_tahun")
    private Integer tahun;
    @Column(name = "ta_semester")
    private Integer semester;

    public Integer getTahun() {
        return tahun;
    }
    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
