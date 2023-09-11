package com.min.edu.model.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.dto.BoardDto;

@Repository
public class BoardDaoImpl implements IBoardDao {

	@Autowired
	private SqlSessionTemplate sqlsession;
	
	private String NS = "com.min.edu.model.mapper.BoardDaoImpl.";
	
	@Override
	public List<BoardDto> selectAll() {
		return sqlsession.selectList(NS+"selectAll");
	}

	@Override
	public int writeBoard(BoardDto BDto) {
		return sqlsession.insert(NS+"writeBoard",BDto);
	}

	@Override
	public BoardDto getOneBoard(String seq) {
		return sqlsession.selectOne(NS+"getOneBoard",seq);
	}

}
