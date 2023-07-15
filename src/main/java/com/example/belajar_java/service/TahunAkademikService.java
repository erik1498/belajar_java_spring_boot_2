package com.example.belajar_java.service;

import com.example.belajar_java.dto.response.TahunAkademikResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TahunAkademikService {
    public List<String> getAllString(){
        String satu = "satu";
        String dua = "dua";
        List<String> list = new ArrayList<>();
        list.add(satu);
        list.add(dua);
        return list;
    }

    public List<TahunAkademikResponse> getAllTahunAkademik(){
        TahunAkademikResponse response1 = new TahunAkademikResponse();
        response1.setTahun(2023);
        response1.setSemester(1);

        TahunAkademikResponse response2 = new TahunAkademikResponse();
        response2.setTahun(2023);
        response2.setSemester(2);

        List<TahunAkademikResponse> tahunAkademikResponseList = new ArrayList<>();
        tahunAkademikResponseList.add(response1);
        tahunAkademikResponseList.add(response2);
        return tahunAkademikResponseList;
    }
}
