package com.heima.education.service;

import com.heima.education.domain.AuthUser;

import java.util.List;

public interface IAuthUserService {

    List<AuthUser> findAll();

}
