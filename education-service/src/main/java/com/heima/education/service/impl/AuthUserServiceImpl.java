package com.heima.education.service.impl;

import com.heima.education.dao.IAuthUserDao;
import com.heima.education.domain.AuthUser;
import com.heima.education.service.IAuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("authUserService")
public class AuthUserServiceImpl implements IAuthUserService {

    @Autowired
    private IAuthUserDao authUserDao;


    public List<AuthUser> findAll() {
        return authUserDao.findAll();
    }
}
