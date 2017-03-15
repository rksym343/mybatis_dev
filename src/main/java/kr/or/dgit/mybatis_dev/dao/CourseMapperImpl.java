package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.services.TutorService;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class CourseMapperImpl implements CourseMapper {

	private static final Log log = LogFactory.getLog(CourseMapperImpl.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.CourseMapper";
	private SqlSession sqlSession;

	
	public CourseMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Course> searchCourse(Map<String, Object> param) {
		log.debug("searchCourse()");
		return sqlSession.selectList(namespace + ".searchCourse", param);

	}

	@Override
	public List<Course> searchChooseCourse(Map<String, Object> param) {
		log.debug("searchChooseCourse()");
		return sqlSession.selectList(namespace + ".searchChooseCourse", param);
	}

	@Override
	public List<Course> searchWhereCourse(Map<String, Object> param) {
		log.debug("searchWhereCourse()");
		return sqlSession.selectList(namespace + ".searchWhereCourse", param);
	}

	@Override
	public List<Course> searchTrimCourses(Map<String, Object> param) {
		log.debug("searchTrimCourses()");
		return sqlSession.selectList(namespace + ".searchTrimCourses", param);
	}

	@Override
	public List<Course> searchForeachCourses(Map<String, Object> param) {
		log.debug("searchForeachCourses()");
		return sqlSession.selectList(namespace + ".searchForeachCourses", param);
	}

	@Override
	public int updateSetCourse(Course course) {
		log.debug("updateSetCourse()");
		int res = sqlSession.update(namespace+ ".updateSetCourse", course);
		sqlSession.commit();
		return res;
	}
}
