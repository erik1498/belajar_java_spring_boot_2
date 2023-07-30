package com.example.belajar_java.dao;

import com.example.belajar_java.entity.TahunAkademikEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TahunAkademikMapper {
    List<TahunAkademikEntity> getAllTahunAkademik();
    void insertDataTahunAkademik(TahunAkademikEntity tahunAkademikEntity);
    void updateDataTahunAkademik(TahunAkademikEntity tahunAkademikEntity);
}
