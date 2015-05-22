package board.dao;
import java.sql.*;
import java.util.*;
//DAO에 있는 메소드들을 Action에서 호출.
import board.dto.Board;
public class BoardDAO {
	BoardDAO(){
	
}
	public Board seletOnBoardByNum(int num){
		return null;
		
	}
	public void updateHits(int num){
		
	}
	public List<Board> selectAllBoards(){
		return null;
		
	}
	public Board selectOneBoardByNum(int num){
		return null;
		
	}
	public int insertBoard(Board board){
		return 0;
		
	}
	public int updateBoard(Board board){
		return 0;
		
	}
	public int deleteBoard(int num){
		return num;
		
	}
}