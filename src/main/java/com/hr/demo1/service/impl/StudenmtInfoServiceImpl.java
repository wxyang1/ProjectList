package com.hr.demo1.service.impl;


import com.hr.demo1.entity.StudentInfo;
import com.hr.demo1.mapper.StudentInfoMapper;
import com.hr.demo1.service.StudenmtInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenmtInfoServiceImpl  implements StudenmtInfoService {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public List<StudentInfo> findAll() {
        return studentInfoMapper.findAll();
        /*StudentInfo stu = new StudentInfo();
        stu.setName("uu");
        return studentInfoMapper.select(stu);*/

    }


}
