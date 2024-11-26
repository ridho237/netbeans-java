package com.mahasiswa.controller;
/**
 *
 * @author Muhammad Ridho
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mahasiswa.model.modelMahasiswa;
import com.mahasiswa.service.mahasiswaService;
import java.util.List;
import org.springframework.stereotype.Controller;

@Controller
public class mahasiswaController {
    @Autowired
    private mahasiswaService mahasiswaService;
    
    public String addMahasiswa(@RequestBody modelMahasiswa mhs){
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa Added Succesfully";
    }
    public modelMahasiswa getMahasiswa(@PathVariable int id){
        return mahasiswaService.getMhs(id);
    }
    public String updateMahasiswa(@RequestBody modelMahasiswa mhs){
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa Updated Successfully";
    }
    public String deleteMahasiswa(@PathVariable int id){
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa Deleted Successfully";
    }
    public List<modelMahasiswa> getAllMahasiswa(){
        return mahasiswaService.getAllMahasiswa();
    }

    public void deleteMhs(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
