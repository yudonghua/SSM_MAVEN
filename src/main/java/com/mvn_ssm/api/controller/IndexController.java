package com.mvn_ssm.api.controller;

import com.alibaba.fastjson.JSON;
import com.mvn_ssm.api.service.DealerService;
import com.mvn_ssm.api.service.IndexService;
import com.mvn_ssm.api.util.StringTranslateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 2017/6/4.
 */
@Controller
public class IndexController {
    @Autowired
    private IndexService indexService;
    @RequestMapping("/item")
    public void itemId(HttpServletResponse response){
        StringTranslateUtil.translate(JSON.toJSONString(indexService.getItems()),response);
    }
    @RequestMapping("/item/{id}")
    public void item(HttpServletResponse response, @PathVariable Long id){
        StringTranslateUtil.translate(JSON.toJSONString(indexService.getItem(id)),response);
    }
}
