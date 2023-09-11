package com.min.edu.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.dto.UserVo;
import com.min.edu.model.mapper.IUserDao;

@Service
public class UserServiceImpl implements IUserService {

	
	@Autowired
	private IUserDao dao;
	
	@Override
	public UserVo getLogin(Map<String, Object> map) {
		return dao.getLogin(map);
	}

	@Override
	public int isDuplicateCheck(String id) {
		return dao.isDuplicateCheck(id);
	}

	@Override
	public int signupMember(UserVo vo) {
		return dao.signupMember(vo);
	}

	@Override
	public List<UserVo> userSelectAll() {
		return dao.userSelectAll();
	}

	@Override
	public UserVo userSelectOne(String id) {
		return dao.userSelectOne(id);
	}

	@Override
	public List<UserVo> getSearchUser(UserVo vo) {
		return dao.getSearchUser(vo);
	}

	@Override
	public String findId(Map<String, Object> map) {
		return dao.findId(map);
	}

	@Override
	public String pwChk(Map<String, Object> map) {
		return dao.pwChk(map);
	}

}
