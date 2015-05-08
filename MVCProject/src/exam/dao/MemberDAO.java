package exam.dao;

import java.io.*;
import java.sql.*;

import exam.dto.Member;

public class MemberDAO {
	public MemberDAO(){
		//System.out.println("생성자");
		//1.JDBC 드라이버 로드
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Connection con=null;
				//2.데이터베이스 연결
				try {
					con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jspuserd","jsp1234");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					
	}
	//회원가입
	public void insertMember(Member member){
		System.out.println("회원가입");
		String sql="insert into member values(?,?,?,?,?,?,default)";

	}
	
	//회원리스트
	public void listMember(){
		
	}
	//회원 상세 페이지
	public void vieMember(){
		
	}
	//회원삭제
	public void deleteMember(){
		System.out.println("회원삭제");
	}
}
