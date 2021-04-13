package test;
import model.Management;
import model.Matter;
import model.Teacher;
import model.Student;
import model.Teacher;
import model.Inscription;
import model.Group;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ManagementTest {
	Management management;
	Student student;
	@Test
	void test() {
		management=new Management();
		management.createMateria("123", "Luna", 3);
		management.createStudent("Maria", "234");
		
	}
	void ingresarStudent() {
		
	}

}
