package kr.or.dgit.mybatis_dev.services;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;


public class StudentService {

	private static final Log log = LogFactory.getLog(StudentService.class);
	// Log import ibatis로 할 것
	// log4j 수정해주세요 trace 할 패키지 확인
	private String namespace="kr.or.dgit.mybatis_dev.dao.StudentMapper";

	public Student findStudentByNo(Student student) {
		log.debug("findStudentByNo()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			return sqlSession.getMapper(StudentMapper.class).selectStudentByNo(student);
		}
	}
	
	
	public Student findStudentByNoApi(Student student) {
		log.debug("findStudentByNoApi()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace+".selectOne", student);
		}
	}
	
	public Student selectStudentByNoAnnotation(Student student) {
		log.debug("selectStudentByNoAnnotation()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			return sqlSession.getMapper(StudentMapper.class).selectStudentByNoAnnotation(student);
		}
	}
	
	
	
	
	public List<Student> selectStudentByAll() {
		log.debug("selectStudentByAll");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAll();
		}
	}
	
	public List<Student> selectStudentByApi() {
		log.debug("selectStudentByApi()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace+".selectAll");
		}
	}
	
	public List<Student> selectStudentByAnnotation() {
		log.debug("selectStudentByAnnotation()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAnnotation();
		}
	}
}
