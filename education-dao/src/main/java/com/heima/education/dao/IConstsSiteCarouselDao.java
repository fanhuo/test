package com.heima.education.dao;

import com.heima.education.domain.ContstSiteCarousel;

import java.util.List;

public interface IConstsSiteCarouselDao {


    /**
     * 加载轮播条
     * @param count 显示条数
     * @return
     */
    List<ContstSiteCarousel> queryCarousel(Integer count) throws Exception;
}
