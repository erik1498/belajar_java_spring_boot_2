package com.example.belajar_java.dto.request;

import javax.validation.constraints.NotNull;

public class TahunAkademikRequest {
    @NotNull(message = "tahun tidak boleh kosong")
    private Integer tahun;

    @NotNull(message = "semester tidak boleh kosong")
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
