package com.jingyan.controller;

import com.jingyan.domain.ContentZH;
import com.jingyan.domain.Step;
import com.jingyan.repository.ArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ArticleController {

    private final static Logger logger = LoggerFactory.getLogger(ArticleController.class);
    /**
     * 返回article页面
     */
    @Autowired
    private ArticleRepository articleRepository;



    @GetMapping(value = "/test")
    public String test(Model model) {
        return "test";
    }

    @GetMapping(value = "/a")
    public String getArticleView(Model model) {
        logger.info("girlList");
        model.addAttribute("name", "sss");
        return "hello";
    }

    @GetMapping(value = "/article/{uuid}")
    public String findByUuid(Model model, @PathVariable("uuid") String uuid) {
        logger.info("girlList..........." + uuid);
//        System.out.println(articleRepository.findByUuid(uuid).toString());
        System.out.println(articleRepository.findOne(12));
        List<Step> stepList = new ArrayList<Step>();
        ContentZH rs=articleRepository.findByUuid(uuid);
        for (int i = 1; i <= 30; i++) {
            String method="getStep"+i+"()";
            Step s=rs.switchStep(rs,i);
            if (s==null)
                break;
            stepList.add(s);
        }
        String[] attentionList=new String[0];
        if (rs.getZhuyi().contains("[br]"))
         attentionList = rs.getZhuyi().split("\\[br]");
        String[] tagList=new String[0];
        if (rs.getTag().contains("[br]"))
            tagList = rs.getTag().split("\\[br]");
        String[] mainImgList=new String[0];
        if (rs.getMain_img().contains("[br]"))
            mainImgList = rs.getMain_img().split("\\[br]");

//        model.addAttribute("article", articleRepository.findOne(12));
        model.addAttribute("article", articleRepository.findByUuid(uuid));
        model.addAttribute("stepList",stepList);
        model.addAttribute("attentionList",attentionList);
        model.addAttribute("tagList",tagList);
        model.addAttribute("mainImgList",mainImgList);

        model.addAttribute("name", "sss");
        return "hello";
    }

    @GetMapping(value = "/publishPage")
    public String getPublishPage(Model model) {
        return "publishPage";
    }

}
