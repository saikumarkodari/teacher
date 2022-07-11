package com.org.tcs.service;

import com.org.tcs.model.Teacher;
import com.org.tcs.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TeacherServiceImp implements TeacherService {
    @Autowired
    TeacherRepo teacherRepo;

    @Override
    public void createTeacherController(Teacher teacher) {
        teacherRepo.save(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        List<Teacher> sai = teacherRepo.findAll();
        return sai;
    }

    @Override
    public String deleteById(Integer id) {
        teacherRepo.deleteById(id);
        return "success";
    }

    @Override
    public String updateAddressBasedOnId(String address, Integer id) {
        Optional<Teacher> sv=teacherRepo.findById(id);
        Teacher rr=sv.get();
        rr.setAdress(address);
        return "success";
    }

    @Override
    public void updateTeacherController(Teacher teacher) {
        teacherRepo.save(teacher);
    }
}
