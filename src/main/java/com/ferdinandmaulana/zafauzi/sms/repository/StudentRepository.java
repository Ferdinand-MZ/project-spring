package com.ferdinandmaulana.zafauzi.sms.repository;

import com.ferdinandmaulana.zafauzi.sms.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository kita gk perlu nambahin ini, karena didalam JpaRepo sudah tersedia secara default
public interface StudentRepository extends JpaRepository<Student, Long> {

}
