package com.org.tcs.repository;

import com.org.tcs.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {

}
