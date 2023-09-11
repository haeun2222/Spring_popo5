package com.min.edu.model.service;

import java.util.List;

import com.min.edu.dto.BoardDto;

public interface IBoardService {

	public List<BoardDto> selectAll();
	
	public int writeBoard(BoardDto BDto);
	
	public BoardDto getOneBoard(String seq);
}
