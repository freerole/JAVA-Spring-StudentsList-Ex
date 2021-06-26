package javaguides.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javaguides.studentmanagement.entity.Student;
import javaguides.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// Student student1 = new Student("lee", "freerole", "freerole83@gmail.com");
		// studentRepository.save(student1);

		// Student student2 = new Student("kim", "freerolegood",
		// "freerolegood@gmail.com");
		// studentRepository.save(student2);

		// Student student3 = new Student("jung", "freedom", "leejskwe@naver.com");
		// studentRepository.save(student3);
	}

}
