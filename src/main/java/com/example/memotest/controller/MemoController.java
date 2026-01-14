package com.example.memotest.controller;

import com.example.memotest.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MemoController {
    private final MemoRepository memoRepository;

    @GetMapping("/")
    public String getMemo(Model model) {
        model.addAttribute("memo", memoRepository.findAll());
        return "index";
    }
}
