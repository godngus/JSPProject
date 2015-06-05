package board.dao;
import java.sql.*;
import java.util.*;

//DAO에 있는 메소드들을 Action에서 호출.
import board.dto.Board;
public class BoardDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public BoardDAO(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jspuserd","jsp1234");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		

	
	public List<Board> selectAllBoards(){
		String sql="select *from board order by num desc";
		List<Board> list =new ArrayList();
		try {
			pstmt =con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Board board =new Board();
				board.setNum(rs.getInt("num"));
				board.setName(rs.getString("name"));
				board.setTitle(rs.getString("title"));
				board.setHits(rs.getInt("hits"));
				board.setContent(rs.getString("content"));
				board.setWdate(rs.getDate("wdate"));
				board.setAttachment(rs.getString("attachment"));
			
				list.add(board);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	
		
	}
	//상세보기
	public Board selectOneBoardByNum(int num){
		String sql="select * from board where num=?";
		Board board=new Board();
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			if(rs.next()){
				board.setNum(rs.getInt("num"));
				board.setName(rs.getString("name"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setAttachment(rs.getString("attachment"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return board;
		
	}
	//조회수 증가
	public void updateHits(int num) throws SQLException{
		String sql="update board set hits =hits+1 where num=?";
		
		pstmt=con.prepareStatement(sql);
		
		pstmt.setInt(1,num);
		
		pstmt.executeUpdate();
	}

	public int insertBoard(Board board){
		String sql="insert into board values(board_seq.nextval,?,?,?,default,default,?)";
		try {
			pstmt =con.prepareStatement(sql);
			
			pstmt.setString(1,board.getName());
			pstmt.setString(2,board.getTitle());
			pstmt.setString(3,board.getContent());
			pstmt.setString(4,board.getAttachment());
			
			int result = pstmt.executeUpdate();
			if(result!=0){
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	public int updateBoard(Board board){
		return 0;
		
	}
	public int deleteBoard(int num){
		return num;
		
	}
}