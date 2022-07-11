package com.org.tcs.service;

import com.org.tcs.model.Teacher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TeacherService {


    public void createTeacherController( Teacher teacher);
    public List<Teacher> getAll();
    public String deleteById( Integer id);
    public String updateAddressBasedOnId( String address, Integer id);
    public void updateTeacherController( Teacher teacher);

    }
