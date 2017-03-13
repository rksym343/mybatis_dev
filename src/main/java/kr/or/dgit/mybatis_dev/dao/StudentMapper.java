package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentMapper {

	Student selectStudentByNo(Student stduent);

	Student selectStudentByNoApi(Student stduent);
	// 웹에서 쓰는 방법.. Spring에서 쓰는 방법

	@Select("select stud_id, name, email, phone, dob from students where stud_id = #{studId}")
	Student selectStudentByNoAnnotation(Student stduent);
	// @ 애노테이션(Annotation) 방법.. 이는 StudentMapper.xml 파일이 필요없다..
	// 단점은 <select><where>와 같은 재활용은 할 수 없다.

	List<Student> selectStudentByAll();

	List<Student> selectStudentByApi();

	@Select("select stud_id, name, email, phone, dob from students")
	List<Student> selectStudentByAnnotation();

	int updateStudent(Student student);

	int updateStudentApi(Student student);

	@Update("update students set name=#{name}, email=#{email}, phone=#{phone}, dob=#{dob} where stud_id = #{studId}")
	int updateStudentAnnotation(Student student);

	int insertStudent(Student student);

	int insertStudentApi(Student student);

	@Insert("insert into students (stud_id, name, email, phone, dob) values(#{studId},#{name}, #{email}, #{phone}, #{dob})")
	int insertStudentAnnotation(Student student);

	int deleteStudent(Student student);

	int deleteStudentApi(Student student);

	@Delete("delete from students where stud_id = #{studId}")
	int deleteStudentAnnotation(Student student);

}
