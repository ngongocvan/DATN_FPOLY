package com.example.datn_fpoly.Controller;

import com.example.datn_fpoly.entity.NhanVien;
import com.example.datn_fpoly.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller

public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/nhan-vien/view")
    public ModelAndView getAll(Model model){
        List<NhanVien> list=nhanVienService.getAll();
        model.addAttribute("list",list);
        return new ModelAndView("admin/nhanvien/nhanvien");
    }
    @GetMapping("/nhan-vien/new")
    public ModelAndView productAddForm(){
        ModelAndView modelAndView=new ModelAndView("admin/nhanvien/add-nhanvien");
        modelAndView.addObject("nhanvien",new NhanVien());
        return modelAndView;
    }

    @PostMapping("/nhan-vien/add")
    public String add(@ModelAttribute NhanVien nhanVien){
        nhanVienService.add(nhanVien);
        return "redirect:/nhan-vien/view";
    }

    @GetMapping("/nhan-vien/delete/{id}")
    public String delete(@PathVariable UUID id){
        nhanVienService.delete(id);
        return "redirect:/nhan-vien/view";
    }

    @GetMapping("/nhan-vien/detail/{id}")
    public ModelAndView detail(@PathVariable UUID id,Model model){
        NhanVien nhanVien=nhanVienService.detail(id);

        model.addAttribute("nhanvien",nhanVien);
        return new ModelAndView("admin/nhanvien/edit-nhanvien");
    }

    @PostMapping("/nhan-vien/update/{id}")
    public String update(@PathVariable UUID id,@ModelAttribute NhanVien nhanVien){
        nhanVienService.update(id,nhanVien);
        return "redirect:/nhan-vien/view";
    }
}
