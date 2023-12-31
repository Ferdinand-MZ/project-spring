package com.ferdinandmaulana.zafauzi.sms.service;

import com.ferdinandmaulana.zafauzi.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent (Student student);

    Student getStudentById(Long id);

    Student updateStudent (Student student);

    void deleteStudentById (Long id);
}
