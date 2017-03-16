package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.CourseMapper;
import kr.or.dgit.mybatis_dev.dao.CourseMapperImpl;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class CourseService {

	public List<Course> searchCourse(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchCourse(param);
		}
	}

	public List<Course> searchChooseCourse(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchChooseCourse(param);
		}
	}

	public List<Course> searchWhereCourse(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchWhereCourse(param);
		}
	}

	public List<Course> searchTrimCourses(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchTrimCourses(param);
		}
	}

	public List<Course> searchForeachCourses(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchForeachCourses(param);
		}
	}

	public int updateSetCourse(Course course) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			int res = courseMapper.updateSetCourse(course);
			sqlSession.commit(); // rollback은 마지막 commit 시점까지.. 그래서 commit은 service 마지막에서 
			return res;
		}
	}

	public int insertCourse(Course course) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			int res = courseMapper.insertCourse(course);
			sqlSession.commit();
			return res;
		}
	}
}
