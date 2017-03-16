package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.UserPicMapper;
import kr.or.dgit.mybatis_dev.dao.UserPicMapperImpl;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class UserPicService {
	private static final Log log = LogFactory.getLog(UserPicService.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.UserPicMapper";

	public int insertUserPic(UserPic userPic) {
		log.debug("insertUserPic()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			int res = userPicMapper.insertUserPic(userPic);
			sqlSession.commit();
			return res;
		}
	}

	public UserPic selectUserPicById(int id) {
		log.debug("selectUserPicById()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			UserPic userPic = userPicMapper.selectUserPicById(id);
			return userPic;
		}
	}
}
