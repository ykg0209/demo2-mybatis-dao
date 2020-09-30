package com.ykg.dao;

import com.ykg.entity.Student;

import java.util.List;

public interface StudentDao {

    List<Student> selectStudent();

    int insertStudent(Student student);

    int updateStudent(Integer id,Student student);


}
