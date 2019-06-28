package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName AccountController
 * @Date 2019-06-28 10:24
 **/
@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层，查询所用用户的信息...");
        return "list";
    }

}
