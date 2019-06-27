package com.heima.education.controller;

import com.heima.education.domain.AuthUser;
import com.heima.education.service.IAuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/auth")
public class AuthUserController {



    @Autowired
    private IAuthUserService authUserService;

    @RequestMapping("findAll")
    public String findAll(Model model){

        List<AuthUser> list =  authUserService.findAll();
        model.addAttribute("authUser",list);
        return "auth";
    }


}
