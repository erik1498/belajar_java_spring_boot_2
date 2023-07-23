package com.example.belajar_java.service;

import com.example.belajar_java.dao.TahunAkademikMapper;
import com.example.belajar_java.dto.response.GlobalResponse;
import com.example.belajar_java.entity.TahunAkademikEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TahunAkademikService {
    final TahunAkademikMapper tahunAkademikMapper;

    public TahunAkademikService(TahunAkademikMapper tahunAkademikMapper) {
        this.tahunAkademikMapper = tahunAkademikMapper;
    }

    public ResponseEntity<GlobalResponse<List<TahunAkademikEntity>>> getAll() {
        GlobalResponse<List<TahunAkademikEntity>> response = new GlobalResponse<>();
        try{
            List<TahunAkademikEntity> allTahunAkademik = tahunAkademikMapper.getAllTahunAkademik();
            if (allTahunAkademik.size() == 0){
                response.setMessage("Data Kosong");
            }else{
                response.setMessage("Data Tersedia");
            }
            response.setData(allTahunAkademik);
            response.setCode(HttpStatus.OK.value());
        }catch (Exception e){
            response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage(e.getMessage());
        }
        return ResponseEntity.status(response.getCode()).body(response);
    }
}
