package application;

import java.sql.Connection;

import db.DB;

public class program {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		conn = DB.getConnection();
		DB.closeConnection(); 

	}

}
