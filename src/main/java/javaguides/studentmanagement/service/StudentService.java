package javaguides.studentmanagement.service;

import java.util.List;

import javaguides.studentmanagement.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);
}
