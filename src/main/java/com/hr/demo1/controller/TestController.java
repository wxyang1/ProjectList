package com.hr.demo1.controller;

import com.hr.demo1.entity.StudentInfo;
import com.hr.demo1.service.StudenmtInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private StudenmtInfoService stu;

    @RequestMapping("/t1")
    public String t1(){
        StudentInfo stu=new StudentInfo();
        stu.setName("ss");
        return "hallo Wode你好";
    }

    @RequestMapping("/findAll")
    public List<StudentInfo> findAll(){

        return stu.findAll();
    }
}
