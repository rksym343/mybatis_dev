package kr.or.dgit.mybatis_dev;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.dto.Gender;
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

/*	@Test
	public void aTestSelectStudentByNoForResultMap() {
		Student std = new Student();
		std.setStudId(1);
		Student selectStudent = studentService.selectStudentByNoForResultMap(std);
		Assert.assertNotNull(selectStudent);
	}

	@Test
	public void bTestSelectStudentByAllForResultMap() {
		List<Student> lists = studentService.selectStudentByAllForResultMap();
		List<Student> emptyLists = Collections.emptyList();
		Assert.assertNotEquals(emptyLists, lists);

	}

	@Test
	public void cTestSelectStudentByNoForHashMap() {
		Student std = new Student();
		std.setStudId(1);
		Map<String, Object> selectStudent = studentService.selectStudentByNoForHashMap(std);
		for (Entry<String, Object> e : selectStudent.entrySet()) {
			System.out.printf("key : %s -> value : %s %n", e.getKey(), e.getValue());
		}
		Assert.assertNotNull(selectStudent);
	}

	@Test
	public void dTestSelectStudentByAllForHashMap() {
		List<Map<String, Object>> lists = studentService.selectStudentByAllForHashMap();
		List<Map<String, Object>> emptyLists = Collections.emptyList();
		for (Map<String, Object> map : lists) {
			for (Entry<String, Object> e : map.entrySet()) {
				System.out.printf("key : %s -> value : %s %n", e.getKey(), e.getValue());
			}
		}
		Assert.assertNotEquals(emptyLists, lists);

	}
	
	@Test
	public void eTestSelectStudentByNoWithAddress() {
		Student std = new Student();
		std.setStudId(1);
		Student selectStudent = studentService.selectStudentByNoWithAddress(std);
		Assert.assertNotNull(selectStudent);
	}
	
	@Test
	public void fTestSelectStudentByNoAssociation() {
		Student std = new Student();
		std.setStudId(1);
		Student selectStudent = studentService.selectStudentByNoAssociation(std);
		Assert.assertNotNull(selectStudent);
	}*/
	
	@Test
	public void gTestInsertStudent() {
		Student std = new Student(3, "학생1", "sdfsf@dsfs.sdf", new Date(), new PhoneNumber("010-0101-0101"), Gender.FEMALE);
		int res = studentService.insertStudent(std);
		Assert.assertSame(1, res);
	}
	
	
	
	@Test
	public void hTestUpdateStudent() {
		Student std = new Student(3, "학생수정수정", "sdfsf@dsfs.sdf", new Date(), new PhoneNumber("010-0101-0101"), Gender.MALE);
		int res = studentService.updateStudent(std);
		Assert.assertSame(1, res);
	}

	@Test
	public void iTestDeleteStudent() {
		Student std = new Student();
		std.setStudId(3);
		int res = studentService.deleteStudent(std);
		Assert.assertSame(1, res);
	}
}
