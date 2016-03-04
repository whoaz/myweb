package com.yida.myweb.sys.controller;

import com.yida.myweb.common.annotation.Log;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhouk on 2016/3/2.
 */
@Controller
public class IndexController {


    @Log
    private Logger logger;

    @RequestMapping(value = "/index")
    public String index(ModelMap modelMap) {
        logger.info("aaaaaaaaaaaaaaaaaaaaaa");
        return "index";
    }
}
