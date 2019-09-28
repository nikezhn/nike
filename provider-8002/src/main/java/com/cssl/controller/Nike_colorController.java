package com.cssl.controller;


import com.cssl.pojo.Nike_color;
import com.cssl.service.INike_colorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
@RestController
@RequestMapping("/nike_color")
public class Nike_colorController {

    @Autowired
    INike_colorService iNike_colorService;

    //查询颜色所有信息;
    @RequestMapping("/colorFindAll")
    public List<Nike_color> colorFindAll(){

        System.out.println("8002-->Nike_colorController-->colorFindAll");
        return iNike_colorService.list();
    }

}
