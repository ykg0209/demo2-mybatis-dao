package com.ykg;

import com.ykg.dao.Impl.StudentDaoImpl;
import com.ykg.dao.StudentDao;
import com.ykg.entity.Student;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void SelectStudent(){
        StudentDao studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.selectStudent();
        students.forEach(System.out::println);
    }

    @Test
    public void InsertStudent(){
        StudentDao studentDao = new StudentDaoImpl();
        Student student = new Student();
        student.setName("曹操");
        student.setEmail("iop@pp.com");
        student.setId(7);
        student.setAge(24);
        int i = studentDao.insertStudent(student);
        System.out.println(i==1?"插入成功":"插入失败");
    }

    @Test
    public void UpdateStudent(){
        StudentDao studentDao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(7);
        student.setName("曹操");
        student.setEmail("caocao@qq.com");
        int i = studentDao.updateStudent(7,student);
        System.out.println(i==1?"更新成功":"更新失败");
    }
}
