package com.example.belajar_java.service;

import com.example.belajar_java.dao.TahunAkademikMapper;
import com.example.belajar_java.dto.response.GlobalResponse;
import com.example.belajar_java.entity.TahunAkademikEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    public GlobalResponse<List<TahunAkademikEntity>> getAll() {
        GlobalResponse<List<TahunAkademikEntity>> response = new GlobalResponse<>();
        try{
            List<TahunAkademikEntity> allTahunAkademik = tahunAkademikMapper.getAllTahunAkademik();
            if (allTahunAkademik.size() == 0){
                response.setMessage("Data Kosong");
            }else{
                response.setMessage("Data Tersedia");
            }
            response.setCode(HttpStatus.OK.value());
        }catch (Exception e){
            response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage(e.getMessage());
        }
        return response;
    }

    public ResponseEntity<GlobalResponse<List<TahunAkademikEntity>>> getAllResponse() {
        GlobalResponse<List<TahunAkademikEntity>> response = new GlobalResponse<>();
        try{
            List<TahunAkademikEntity> allTahunAkademik = tahunAkademikMapper.getAllTahunAkademik();
            if (allTahunAkademik.size() == 0){
                response.setMessage("Data Kosong");
            }else{
                response.setMessage("Data Tersedia");
            }
            response.setCode(HttpStatus.OK.value());
            return ResponseEntity.ok(response);
        }catch (Exception e){
            response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setMessage(e.getMessage());
            return ResponseEntity.internalServerError().body(response);
        }
    }
}
