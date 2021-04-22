package com.hr.demo1.mapper;


import com.hr.demo1.entity.StudentInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StudentInfoMapper extends Mapper<StudentInfo> {
    public List<StudentInfo> findAll();
}
