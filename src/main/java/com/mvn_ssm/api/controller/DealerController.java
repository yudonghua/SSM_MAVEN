package com.mvn_ssm.api.controller;

import com.alibaba.fastjson.JSON;
import com.mvn_ssm.api.service.DealerService;
import com.mvn_ssm.api.service.IndexService;
import com.mvn_ssm.api.util.StringTranslateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 商户controller，目前实现了登陆功能
 * Created by WLY-Spring on 2017/5/27.
 */
@Controller
@RequestMapping("/dealer")
public class DealerController {

    @Autowired
    private DealerService dealerService;
    /**
     * 商户登陆，需要前端提供登录名或者密码。
     * 返回值CODE为0时表示登陆失败，为1时表示登陆成功
     * @param username：商户用户名
     * @param password：商户登陆密码
     */
    @RequestMapping("/login")
    public void login(String username,String password,HttpServletResponse response){
        Map<String,String> resultMap=new HashMap<String,String>();
        //参数非空检验
        if (username==null || password==null){
            resultMap.put("CODE","0");
            StringTranslateUtil.translate(JSON.toJSONString(resultMap),response);
        }
        if (dealerService.login(username,password)){
            resultMap.put("CODE","1");
        }
        else{
            resultMap.put("CODE","0");
        }
        StringTranslateUtil.translate(JSON.toJSONString(resultMap),response);
    }
    @RequestMapping("/test")
    public void test(HttpServletResponse response){
        Map<String,String> resultMap=new HashMap<String,String>();
        resultMap.put("Logintest",dealerService.getPassword("Logintest"));
        StringTranslateUtil.translate(JSON.toJSONString(resultMap),response);
        StringTranslateUtil.translate(JSON.toJSONString(resultMap),response);
    }
    /*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestParam String username, @RequestParam String password, HttpServletResponse response) {
        Map<String, String> resultMap = new HashMap<>();
        if (loginService.dealerLogin(username, password)) {
            resultMap.put("message", "Login Success");
        } else {
            resultMap.put("message", "Login Error");
        }
        StringTranslateUtil.translate(JSON.toJSONString(resultMap),response);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "index.jsp";
    }*/
}
