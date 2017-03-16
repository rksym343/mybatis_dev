package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

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
	private String namespace = "kr.or.dgit.mybatis_dev.dao.StudentMapper";

	public Student selectStudentByNoForResultMap(Student student) {
		log.debug("selectStudentByNoForResultMap()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectStudentByNoForResultMap", student);
		}
	}

	public List<Student> selectStudentByAllForResultMap() {
		log.debug("selectStudentByAllForResultMap()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
		}
	}

	public Map<String, Object> selectStudentByNoForHashMap(Student student) {
		log.debug("selectStudentByNoForHashMap()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectStudentByNoForHashMap", student);
		}
	}

	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		log.debug("selectStudentByAllForHashMap()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectList(namespace+".selectStudentByNoForHashMap");
		}
	}
	
	public Student selectStudentByNoWithAddress(Student student){
		log.debug("selectStudentByNoWithAddress()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectStudentByNoWithAddress", student);
		}
	}
	
	
	public Student selectStudentByNoAssociation(Student student){
		log.debug("selectStudentByNoAssociation()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectStudentByNoAssociation", student);
		}
	}
	
	public int insertStudent(Student student){
		log.debug("insertStudent()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			int res = sqlSession.insert(namespace + ".insertStudent", student);
			sqlSession.commit();
			return res;
		}
	}
	public int deleteStudent(Student student){
		log.debug("deleteStudent()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			int res = sqlSession.insert(namespace + ".deleteStudent", student);
			sqlSession.commit();
			return res;
		}
	}
	public int updateStudent(Student student){
		log.debug("updateStudent()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			int res = sqlSession.insert(namespace + ".updateStudent", student);
			sqlSession.commit();
			return res;
		}
	}
	

}
