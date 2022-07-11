package com.org.tcs.controller;

import com.org.tcs.model.Teacher;
import com.org.tcs.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class TeacherController {
    @Autowired
    TeacherService teacherService;


    @PostMapping("/create")
    public void createTeacherController(@RequestBody Teacher teacher){
        teacherService.createTeacherController(teacher);
    }
    @GetMapping("/getAll")
    public List<Teacher> getAll(){
       List<Teacher> ss= teacherService.getAll();
        return ss;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
       String vv= teacherService.deleteById(id);
        return vv;
    }
    @PatchMapping("/updateAddressBasedOnId/{address}/{id}")
    public String updateAddressBasedOnId(@PathVariable String address,@PathVariable Integer id){
       String sk= teacherService.updateAddressBasedOnId(address,id);
        return sk;

    }
    @PutMapping("/update")
    public void updateTeacherController(@RequestBody Teacher teacher){
        teacherService.updateTeacherController(teacher);

    }

}
