package com.ykg.dao.Impl;

import com.ykg.dao.StudentDao;
import com.ykg.entity.Student;
import com.ykg.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudent() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId="com.ykg.dao.StudentDao.selectStudent";
        List<Student> students = sqlSession.selectList(sqlId);
//        students.forEach(System.out::println);
        sqlSession.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId="com.ykg.dao.StudentDao.insertStudent";
        int i = sqlSession.insert(sqlId,student);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }

    @Override
    public int updateStudent(Integer id, Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.ykg.dao.StudentDao.updateStudent";
        int i = sqlSession.update(sqlId,student);
        sqlSession.commit();
        sqlSession.close();
        return i;

    }
}
