package com.test.popo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.min.edu.dto.BoardDto;
import com.min.edu.model.mapper.IBoardDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardJUnitTest {

	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private IBoardDao dao;
	
//	@Test
	public void test() {
		SqlSessionTemplate session = context.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
		assertNotNull(session);
	}
	
	@Test
	public void BoardTest() {
//		List<BoardDto> lists = dao.selectAll();
//		assertNotNull(lists);
		
//		BoardDto dto = new BoardDto(0, "zz", "zz?", "ㅋㅋ", 0, 0, 0, null, null);
//		int n = dao.writeBoard(dto);
//		assertEquals(1, n);
		
//		BoardDto dto = dao.getOneBoard("161");
//		assertNotNull(dto);
		
		
		
	}

}
