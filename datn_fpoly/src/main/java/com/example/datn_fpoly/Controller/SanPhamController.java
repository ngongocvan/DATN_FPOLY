package com.example.datn_fpoly.Controller;


import com.example.datn_fpoly.entity.SanPham;
import com.example.datn_fpoly.service.SanPhamService;
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
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("/san-pham/view")
    public ModelAndView getAll(Model model){
        List<SanPham> lst = sanPhamService.getAll();
        model.addAttribute("lst",lst);
        return  new ModelAndView("admin/sanpham/sanpham");

    }
    @GetMapping("/san-pham/new")
    public  ModelAndView addForm(){
        ModelAndView modelAndView = new ModelAndView("admin/sanpham/add-sanpham");
        modelAndView.addObject("sanpham", new SanPham());
        return modelAndView;
    }
    @PostMapping("/san-pham/add")
    public String add(@ModelAttribute SanPham sanPham){
        sanPhamService.add(sanPham);
        return "redirect:/san-pham/view";
    }
    @GetMapping("/san-pham/delete/{id}")
    public String delete(@PathVariable UUID id){
        sanPhamService.delete(id);
        return "redirect:/san-pham/view";
    }
    @GetMapping("/san-pham/detail/{id}")
    public ModelAndView detail(@PathVariable UUID id,Model model){
        SanPham sanPham=sanPhamService.detaill(id);

        model.addAttribute("sanpham",sanPham);
        return new ModelAndView("admin/sanpham/edit-sanpham");
    }
    @PostMapping("/san-pham/update/{id}")
    public String update(@PathVariable UUID id,@ModelAttribute SanPham sanPham){
        sanPhamService.update(id,sanPham);
        return "redirect:/san-pham/view";
    }
}
