package com.heima.education.service.impl;

import com.heima.education.dao.IConstsSiteCarouselDao;
import com.heima.education.domain.ContstSiteCarousel;
import com.heima.education.service.IConstsSiteCarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service("constsSiteCarouselService")
public class ConstsSiteCarouselServiceImpl implements IConstsSiteCarouselService {

    @Autowired
    private IConstsSiteCarouselDao constsSiteCarouselDao;


    public List<ContstSiteCarousel> queryCarousel(Integer count) throws Exception{
        List<ContstSiteCarousel> carouselList = constsSiteCarouselDao.queryCarousel(count);
        return carouselList;
    }
}
