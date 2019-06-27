package com.heima.education.controller;


import com.heima.education.domain.ContstSiteCarousel;
import com.heima.education.service.IConstsSiteCarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping()
public class PortalController {

    @Autowired
    private IConstsSiteCarouselService constsSiteCarouselService;



    @RequestMapping("index")
    public ModelAndView index() throws  Exception{
        ModelAndView model = new ModelAndView("index");

        //加载轮播
        List<ContstSiteCarousel> carouselList =  constsSiteCarouselService.queryCarousel(4);
        model.addObject("carouselList",carouselList);





        return model;
    }



}
