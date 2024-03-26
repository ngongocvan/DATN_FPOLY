package com.example.datn_fpoly.Controller;

import com.example.datn_fpoly.entity.KhachHang;
import com.example.datn_fpoly.entity.NhanVien;
import com.example.datn_fpoly.service.KhachHangService;
import com.example.datn_fpoly.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;
@Controller
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangSer;

    @GetMapping("/khach-hang/view")
    public ModelAndView getAll(Model model){
        List<KhachHang> list=khachHangSer.getAll();
        model.addAttribute("list",list);
        return new ModelAndView("admin/khachhang/khachhang");
    }
    @GetMapping("/khach-hang/new")
    public ModelAndView productAddForm(){
        ModelAndView modelAndView=new ModelAndView("admin/khachhang/add-khachhang");
        modelAndView.addObject("khachhang",new KhachHang());
        return modelAndView;
    }

    @PostMapping("/khach-hang/add")
    public String add(@ModelAttribute KhachHang khachhang){
        khachHangSer.add(khachhang);
        return "redirect:/khach-hang/view";
    }

    @GetMapping("/khach-hang/delete/{id}")
    public String delete(@PathVariable UUID id){
        khachHangSer.delete(id);
        return "redirect:/khach-hang/view";
    }

    @GetMapping("/khach-hang/detail/{id}")
    public ModelAndView detail(@PathVariable UUID id,Model model){
        KhachHang khachhang = khachHangSer.detail(id);

        model.addAttribute("khachhang",khachhang);
        return new ModelAndView("admin/khachhang/edit-khachhang");
    }

    @PostMapping("/khach-hang/update/{id}")
    public String update(@PathVariable UUID id,@ModelAttribute KhachHang khachhang){
        khachHangSer.update(id,khachhang);
        return "redirect:/khach-hang/view";
    }
}
