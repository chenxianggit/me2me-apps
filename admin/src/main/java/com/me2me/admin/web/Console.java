package com.me2me.admin.web;

import com.me2me.content.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/3/25.
 */
@Controller
@RequestMapping("/console")
public class Console  {

    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/signIn")
    public String signIn(){
        return "login";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/data")
    public ModelAndView data(){
        ModelAndView mv = new ModelAndView("data");
        List<String> list = new ArrayList<String>();
        for(int i = 0;i<100; i++){
            list.add(i+"");
        }
        mv.addObject("data",list);
        return mv;
    }

    @RequestMapping(value = "/publish")
    public String publish(){
        return "publish";
    }

    @RequestMapping(value = "/forward")
    public ModelAndView forward(){
        ModelAndView mv = new ModelAndView("forward");
//        Map map = new HashMap<>();
//        map.put("coverImage","");
        // mv.addObject("data",map);
        return mv;
    }


}
