package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.CourseService;

//메소드 실행순서
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseServiceTest {
	private static CourseService courseService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		courseService = new CourseService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		courseService = null;
	}

	@Before
	public void setUp() {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() {
		System.out.println("tearDown()");
	}
	//////////////////////////////////////////////////////////
	/*
	 * @Test public void aTestSearchCourse() { Map<String, Object> param = new
	 * HashMap<>(); param.put("tutorId", 1); param.put("courseName", "%java%");
	 * param.put("startDate", "2013-01-01"); param.put("endDate", "2013-05-01");
	 * 
	 * List<Course> searchCourse = courseService.searchCourse(param);
	 * Assert.assertNotNull(searchCourse); }
	 * 
	 * @Test public void bTestSearchChooseCourse() { Map<String, Object> param =
	 * new HashMap<>(); param.put("searchBy", "Tutor"); param.put("tutorId", 1);
	 * 
	 * List<Course> searchCourse = courseService.searchChooseCourse(param);
	 * System.out.println("TestSearchChooseCourse()" + param);
	 * 
	 * 
	 * 
	 * param.replace("searchBy", "CourseName"); param.remove("tutorId");
	 * param.put("courseName", "%java%");
	 * 
	 * searchCourse = courseService.searchChooseCourse(param);
	 * System.out.println("TestSearchChooseCourse()" + param);
	 * 
	 * param.replace("searchBy", ""); param.remove("courseName");
	 * 
	 * searchCourse = courseService.searchChooseCourse(param);
	 * System.out.println("TestSearchChooseCourse()" + param); }
	 */

	/*
	 * @Test public void cTestSearchWhereCourse() { Map<String, Object> param =
	 * new HashMap<>();
	 * 
	 * List<Course> searchCourse = courseService.searchWhereCourse(param);
	 * System.out.println("cTestSearchWhereCourse()" + param);
	 * 
	 * 
	 * param.put("tutorId", 1); searchCourse =
	 * courseService.searchWhereCourse(param);
	 * System.out.println("cTestSearchWhereCourse()" + param);
	 * 
	 * 
	 * param.put("courseName", "%java%"); searchCourse =
	 * courseService.searchWhereCourse(param);
	 * System.out.println("cTestSearchWhereCourse()" + param);
	 * 
	 * param.clear(); param.put("startDate", "2013-01-01"); searchCourse =
	 * courseService.searchWhereCourse(param);
	 * System.out.println("cTestSearchWhereCourse()" + param);
	 * 
	 * 
	 * param.clear(); param.put("endDate", new Date()); searchCourse =
	 * courseService.searchWhereCourse(param);
	 * System.out.println("cTestSearchWhereCourse()" + param); }
	 */

	/*
	 * @Test public void dTestSearchTrimCourses() { Map<String, Object> param =
	 * new HashMap<>();
	 * 
	 * List<Course> searchCourse = courseService.searchTrimCourses(param);
	 * System.out.println("searchTrimCourses()" + param);
	 * 
	 * 
	 * param.put("tutorId", 1); searchCourse =
	 * courseService.searchTrimCourses(param);
	 * System.out.println("searchTrimCourses()" + param);
	 * 
	 * 
	 * param.put("courseName", "%java%"); searchCourse =
	 * courseService.searchTrimCourses(param);
	 * System.out.println("searchTrimCourses()" + param);
	 * 
	 * param.put("startDate", "2013-01-01"); searchCourse =
	 * courseService.searchTrimCourses(param);
	 * System.out.println("searchTrimCourses()" + param);
	 * 
	 * 
	 * param.clear(); param.put("endDate", "2017-03-15"); searchCourse =
	 * courseService.searchTrimCourses(param);
	 * System.out.println("searchTrimCourses()" + param); }
	 */

	/*
	 * @Test public void eTestSearchForeachCourses() { List<Integer> tutorIdss =
	 * new ArrayList<>(); tutorIdss.add(1);
	 * 
	 * Map<String, Object> param = new HashMap<>(); param.put("tutorIds",
	 * tutorIdss);
	 * 
	 * List<Course>  searchCourse = courseService.searchForeachCourses(param);
	 * System.out.println("searchForeachCourses()" + param);
	 * 
	 * tutorIdss.add(2); searchCourse =
	 * courseService.searchForeachCourses(param);
	 * System.out.println("searchForeachCourses()" + param);
	 * 
	 * param = null;
	 * 
	 * searchCourse = courseService.searchForeachCourses(param);
	 * System.out.println("searchForeachCourses()" + param);
	 * 
	 * }
	 */
/*
	@Test
	public void fTestUpdateSetCourse() {
		Course course = new Course(3, "수업1", "설명2131213213212331", new Date(2017, 1, 1), new Date(2017, 2, 15), 3);
		int res = courseService.updateSetCourse(course);
		Assert.assertSame(1, res);
	}

	
	@Test
	public void gTestInsertCourse() {
		Course course = new Course(4, "수업2", "설명2131sdf12331", new Date(2017, 1, 1), new Date(2017, 2, 15), 3);
		int res = courseService.insertCourse(course);
		Assert.assertEquals(1, res);
	}*/
}
