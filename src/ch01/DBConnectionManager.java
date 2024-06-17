package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

	
	private static final String URL = "jdbc:mysql://localhost:3306/demo3?serverTimezone=Asia/Seoul";
	private static final String USER = "root";
	private static final String PASSWORD = "asd123";
	
	// static {} 블록 - 정적 초기화 블록이라고 한다.
	// 클래스가 처음 로드될때 한번 실행된다.
	// 정적 변수(static)의 초기화나 복잡한 초기화 작업을 수행할 때 사용할 수 있다.
	// static {} 블록안에 예외를 던질 수도 있다.
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	} 
	
	// 정적 메서드(함수) 커넥션 객체를 리턴하는 함수를 만들어 보자
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	

} // end of class
