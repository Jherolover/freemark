package com.elite.freemark.controller;

import com.elite.freemark.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FreeMarkerController {

    /**
     * 主页索引
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(ModelMap modelMap){
        Person p = new Person();
        modelMap.addAttribute("username","elite");
        modelMap.addAttribute("password","****");
        modelMap.addAttribute("computer","dell");
        return "index";
    }
    /**
     * 返回用户列表
     */
    @RequestMapping(value ="personlist")
    public String  center(ModelMap map){
        map.put("persons",getPersonList());
        map.put("title","用户列表");
        return "UserInfo";
    }

    /**
     * 用户列表
     * @return
     */
    private List<Map> getPersonList(){
        List<Map> list= new ArrayList<>();
        for(int i=0;i<10;i++){
            Map map= new HashMap();
            map.put("username","elite_"+i);
            map.put("age",18+i);
            map.put("phonenumber","15688666080"+i);
            list.add(map);
        }
        return list;
    }
}
