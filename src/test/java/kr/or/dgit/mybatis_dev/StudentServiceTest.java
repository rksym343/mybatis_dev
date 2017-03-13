package kr.or.dgit.mybatis_dev;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
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
	public void setUp() {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() {
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

	@Test
	public void gTestUpdateStudent() {
		Student std = new Student(1, "Timothy1", "timothy@gmail.com", new Date(1988 - 1900, 4 - 1, 25),
				new PhoneNumber("123-123-1234"));
		int res = studentService.updateStudent(std);
		Assert.assertEquals(1, res);
	}

	@Test
	public void hTestUpdateStudentApi() {
		Student std = new Student(2, "Douglas1", "douglas@gmail.com", new Date(1990 - 1900, 8 - 1, 15),
				new PhoneNumber("789-456-1234"));
		int res = studentService.updateStudentApi(std);
		Assert.assertEquals(1, res);
	}

	@Test
	public void iTestUpdateStudentAnnotation() {
		Student std = new Student(2, "Douglas", "douglas22@gmail.com", new Date(1990 - 1900, 8 - 1, 15),
				new PhoneNumber("789-456-1234"));
		int res = studentService.updateStudentAnnotation(std);
		Assert.assertEquals(1, res);
	}

	@Test
	public void jTestInsertStudent() {
		Student std = new Student(3, "Timothy1", "timothy@gmail.com", new Date(1988 - 1900, 4 - 1, 25),
				new PhoneNumber("123-123-1234"));
		int res = studentService.insertStudent(std);
		Assert.assertEquals(1, res);
	}

	@Test
	public void kTestInsertStudentApi() {
		Student std = new Student(4, "Douglas1", "douglas@gmail.com", new Date(1990 - 1900, 8 - 1, 15),
				new PhoneNumber("789-456-1234"));
		int res = studentService.insertStudentApi(std);
		Assert.assertEquals(1, res);
	}

	@Test
	public void lTestInsertStudentAnnotation() {
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(1990, 7, 15);
		Student std = new Student(5, "Douglas", "douglas22@gmail.com", cal.getTime(), new PhoneNumber("789-456-1234"));
		int res = studentService.insertStudentAnnotation(std);
		Assert.assertEquals(1, res);
	}

	@Test
	public void mTestDeleteStudent() {
		Student std = new Student();
		std.setStudId(3);
		int res = studentService.deleteStudent(std);
		Assert.assertEquals(1, res);
	}

	@Test
	public void nTestDeleteStudentApi() {
		Student std = new Student();
		std.setStudId(4);
		int res = studentService.deleteStudentApi(std);
		Assert.assertEquals(1, res);
	}

	@Test
	public void oTestDeleteStudentAnnotation() {
		Student std = new Student();
		std.setStudId(5);
		int res = studentService.deleteStudentAnnotation(std);
		Assert.assertEquals(1, res);
	}

}
