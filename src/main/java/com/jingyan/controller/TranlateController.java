package com.jingyan.controller;

import com.jingyan.domain.ContentZH;
import com.jingyan.repository.ArticleRepository;
import com.jingyan.util.translate.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
@RestController
public class TranlateController {
    @Autowired
    private ArticleRepository contentRepository;

   @GetMapping(value = "/yes")
    public String tanslate() throws UnsupportedEncodingException {
       ContentZH content = contentRepository.findOne(15);
        String target = content.getStep2();
        String yiwen = Main.translate(target);
        System.out.println("target.length()"+target.length());
        return content.getStep2();

    }
}