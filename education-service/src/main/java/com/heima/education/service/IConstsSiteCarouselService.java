package com.heima.education.service;


import com.heima.education.domain.ContstSiteCarousel;

import java.util.List;

/**
 * 轮播业务
 */
public interface IConstsSiteCarouselService {


    /**
     * 加载轮播条
     * @param count
     * @return
     */
    List<ContstSiteCarousel> queryCarousel (Integer count) throws Exception;
}
