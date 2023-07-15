package com.example.belajar_java.service;

import com.example.belajar_java.dao.TahunAkademikMapper;
import com.example.belajar_java.dto.response.TahunAkademikResponse;
import com.example.belajar_java.entity.TahunAkademikEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TahunAkademikService {
    final TahunAkademikMapper tahunAkademikMapper;

    public TahunAkademikService(TahunAkademikMapper tahunAkademikMapper) {
        this.tahunAkademikMapper = tahunAkademikMapper;
    }

    public List<String> getAllString(){
        String satu = "satu";
        String dua = "dua";
        List<String> list = new ArrayList<>();
        list.add(satu);
        list.add(dua);
        return list;
    }

    public List<TahunAkademikEntity> getAllTahunAkademik(){
        List<TahunAkademikEntity> allTahunAkademik = tahunAkademikMapper.getAllTahunAkademik();
        return allTahunAkademik;
    }
}
