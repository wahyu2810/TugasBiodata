package com.tugas.biodata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BiodataController {

    @GetMapping("/")
    public String index() {
        return "index"; // Mengarahkan ke halaman pembuka
    }

    @GetMapping("/biodata")
    public String getBiodata(Model model) {
        // Atribute model
        model.addAttribute("nama", "Wahyu Noer Rahmat");
        model.addAttribute("umur", "21 tahun");
        model.addAttribute("alamat", "Jl.Nuri, Kedaung, Sawangan, Kota Depok, Jawa Barat");
        model.addAttribute("pekerjaan", "Mahasiswa");
        return "biodata"; // Mengarahkan ke halaman biodata
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Mengarahkan ke halaman kontak
    }

    @PostMapping("/send-message")
    public String sendMessage(@RequestParam String name, @RequestParam String email, @RequestParam String message) {
        // Logika untuk mengirim pesan, misalnya menyimpannya ke database atau mengirim email
        System.out.println("Pesan dari: " + name + ", Email: " + email + ", Pesan: " + message);
        return "redirect:/"; // Kembali ke halaman pembuka setelah mengirim pesan
    }
}