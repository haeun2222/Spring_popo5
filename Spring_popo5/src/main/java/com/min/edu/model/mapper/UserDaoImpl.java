package com.min.edu.model.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.dto.UserVo;

@Repository
public class UserDaoImpl implements IUserDao {
	
	@Autowired
	private SqlSessionTemplate session;
	
	private String NS ="com.min.edu.model.mapper.UserDaoImpl.";

	@Override
	public UserVo getLogin(Map<String, Object> map) {
		return session.selectOne(NS+"getLogin",map);
	}

	@Override
	public int isDuplicateCheck(String id) {
		return session.selectOne(NS+"isDuplicateCheck",id);
	}

	@Override
	public int signupMember(UserVo vo) {
		return session.insert(NS+"signupMember",vo);
	}

	@Override
	public List<UserVo> userSelectAll() {
		return session.selectOne(NS+"userSelectAll");
	}

	@Override
	public UserVo userSelectOne(String id) {
		return session.selectOne(NS+"userSelectOne",id);
	}

	@Override
	public List<UserVo> getSearchUser(UserVo vo) {
		return session.selectList(NS+"getSearchUser",vo);
	}

	@Override
	public String findId(Map<String, Object> map) {
		return session.selectOne(NS+"findId",map);
	}

	@Override
	public String pwChk(Map<String, Object> map) {
		return session.selectOne(NS+"pwChk",map);
	}

}
