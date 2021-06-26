package javaguides.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javaguides.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
