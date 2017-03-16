package kr.or.dgit.mybatis_dev.dao;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public interface UserPicMapper {
	int insertUserPic(UserPic userPic);
	UserPic selectUserPicById(int id); // 이거보다는 UserPic userPic 넘겨주는 것이 바람직
	
}
