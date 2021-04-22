package com.hr.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ServletComponentScan("com.hr") //使用过滤器(配置servlet扫描器)
@MapperScan("com.hr.demo1.mapper") //将路径下的接口放到配置文件中
public class Demo1Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo1Application.class, args);
    }

}
