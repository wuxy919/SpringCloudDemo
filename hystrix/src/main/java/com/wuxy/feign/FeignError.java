package com.wuxy.feign;

import com.wuxy.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author: wuxy
 * @create: 2019-04-12 09:22
 **/
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String index() {
        return "服务器维护中。。。";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student deleteById(long id) {
        return null;
    }
}
