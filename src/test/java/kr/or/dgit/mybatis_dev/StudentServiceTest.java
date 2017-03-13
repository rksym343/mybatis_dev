package kr.or.dgit.mybatis_dev;


import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

//메소드 실행순서
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService studentService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		studentService = null;
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}

	@Test
	public void aTestFindStudentByNo() {
		Student std = new Student();
		std.setStudId(1);

		Student findStd = studentService.findStudentByNo(std);
		Assert.assertNotNull(findStd);
	}

	@Test
	public void bTestFindStudentByNoApi() {
		Student std = new Student();
		std.setStudId(2);

		Student findStd = studentService.findStudentByNoApi(std);
		Assert.assertNotNull(findStd);

	}

	@Test
	public void cTestFindStudentByNoAnnotation() {
		Student std = new Student();
		std.setStudId(1);

		Student findStd = studentService.selectStudentByNoAnnotation(std);
		Assert.assertNotNull(findStd);

	}

	@Test
	public void dTestFindStudentByAll() {
		List<Student> list = studentService.selectStudentByAll();
		Assert.assertNotNull(list);
	}
	
	@Test
	public void eTestFindStudentByApi() {
		List<Student> list = studentService.selectStudentByApi();
		Assert.assertNotNull(list);
	}
	
	@Test
	public void fTestFindStudentByAnnotation() {
		List<Student> list = studentService.selectStudentByAnnotation();
		Assert.assertNotNull(list);
	}

}
