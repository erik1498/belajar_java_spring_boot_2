package com.example.belajar_java.dto.request;

public class TahunAkademikRequest {
    private Integer tahun;
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
}
