package com.wuxy.repository;

import com.wuxy.entity.Student;

import java.util.Collection;

/**
 * @author: wuxy
 * @create: 2019-04-11 10:25
 **/
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
