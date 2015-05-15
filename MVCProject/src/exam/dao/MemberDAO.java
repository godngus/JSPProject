package exam.dao;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import exam.dto.Member;
//DAO는 DB관리
public class MemberDAO {
	private Connection con=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	public MemberDAO(){
		//System.out.println("생성자");
		//1.JDBC 드라이버 로드
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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
		
		String id=member.getId();
		String password=member.getPassword();
		String name=member.getName();
		int age=member.getAge();
		String gender=member.getGender();
		String address=member.getAddr();
		try {
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setInt(4, age);
			pstmt.setString(5, gender);
			pstmt.setString(6, address);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//로그인
	public int LoginMember(String id,String password){
		String sql ="select*from member where id=? and password=?";
		int result=0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				return 1; //성공
				
			}
			else
				return 0; //실패
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	//회원리스트
	public List<Member> listMember(){
		String sql="select*from member order by id";
		List<Member> list=new ArrayList();
		
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Member member=new Member();
				
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setAge(Integer.parseInt(rs.getString("age")));
				member.setGender(rs.getString("gender"));
				member.setRegDate(rs.getDate("regdate"));
				
				list.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
		
	}
	//회원 상세 페이지
	public void viewMember(){
		
	}
	//회원삭제
	public void deleteMember(){
		System.out.println("회원삭제");
	}
}
