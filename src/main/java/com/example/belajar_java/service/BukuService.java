package com.example.belajar_java.service;

import com.example.belajar_java.dto.res.BukuResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BukuService {
    public List<BukuResponse> getAllBuku(){
        BukuResponse buku1 = new BukuResponse();
        buku1.setPenulis("JK Rowling");
        buku1.setJudul("Harry Potter");

        BukuResponse buku2 = new BukuResponse();
        buku2.setJudul("Pengabdi Setan");
        buku2.setPenulis("Joko Anwar");

        List<BukuResponse> list = new ArrayList<>();
        list.add(buku1);
        list.add(buku2);
        return list;
    }
}
