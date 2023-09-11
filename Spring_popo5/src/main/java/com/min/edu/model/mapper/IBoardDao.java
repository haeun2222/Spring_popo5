package com.min.edu.model.mapper;

import java.util.List;

import com.min.edu.dto.BoardDto;

public interface IBoardDao {

	
	public List<BoardDto> selectAll();
	
	public int writeBoard(BoardDto BDto);
	
	public BoardDto getOneBoard(String seq);
	
}
