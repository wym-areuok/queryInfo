package top.areuok.queryinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @title: Test
 * @Author weiyiming
 * @Date: 2022/9/26 12:22
 * @Version 1.0
 */
@RestController
public class Test {
    @RequestMapping(value = "/index") // 访问路径
    public ModelAndView toIndex(){
        ModelAndView view  = new ModelAndView("index");
        return view;
    }
}
