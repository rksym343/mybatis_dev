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
	private String namespace = "kr.or.dgit.mybatis_dev.dao.StudentMapper";

	public Student selectStudentByNoForResultMap(Student student) {
		log.debug("selectStudentByNoForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoForResultMap", student);
		}
	}

	public List<Student> selectStudentByAllForResultMap() {
		log.debug("selectStudentByAllForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
		}
	}

	public Student findStudentByNo(Student student) {
		log.debug("findStudentByNo()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			return sqlSession.getMapper(StudentMapper.class).selectStudentByNo(student);
		}
	}

	public Student findStudentByNoApi(Student student) {
		log.debug("findStudentByNoApi()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + ".selectOne", student);
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
			return sqlSession.selectList(namespace + ".selectAll");
		}
	}

	public List<Student> selectStudentByAnnotation() {
		log.debug("selectStudentByAnnotation()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAnnotation();
		}
	}

	public int updateStudent(Student student) {
		log.debug("updateStudent()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.getMapper(StudentMapper.class).updateStudent(student);
			sqlSession.commit();
			return res;
		}
	}

	public int updateStudentApi(Student student) {
		log.debug("updateStudentApi()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.update(namespace + ".updateOne", student);
			sqlSession.commit();
			return res;
		}
	}

	public int updateStudentAnnotation(Student student) {
		log.debug("updateStudentAnnotation()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.getMapper(StudentMapper.class).updateStudentAnnotation(student);
			sqlSession.commit();
			return res;
		}
	}

	public int insertStudent(Student student) {
		log.debug("insertStudent()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.getMapper(StudentMapper.class).insertStudent(student);
			sqlSession.commit();
			return res;
		}
	}

	public int insertStudentApi(Student student) {
		log.debug("insertStudentApi()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.insert(namespace + ".insertOne", student);
			sqlSession.commit();
			return res;
		}
	}

	public int insertStudentAnnotation(Student student) {
		log.debug("insertStudentAnnotation()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.getMapper(StudentMapper.class).insertStudentAnnotation(student);
			sqlSession.commit();
			return res;
		}
	}

	public int deleteStudent(Student student) {
		log.debug("deleteStudent()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.getMapper(StudentMapper.class).deleteStudent(student);
			sqlSession.commit();
			return res;
		}
	}

	public int deleteStudentApi(Student student) {
		log.debug("deleteStudentApi()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.delete(namespace + ".deleteOne", student);
			sqlSession.commit();
			return res;
		}
	}

	public int deleteStudentAnnotation(Student student) {
		log.debug("deleteStudentAnnotation()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.getMapper(StudentMapper.class).deleteStudentAnnotation(student);
			sqlSession.commit();
			return res;
		}
	}

}
