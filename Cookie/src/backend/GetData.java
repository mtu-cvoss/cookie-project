package backend;
import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import inflow.*;

public class GetData {
	
	private Connection conn;
	
	public GetData( String user, String password ) {
		dbConnect dbC = new dbConnect();
		try {
			conn = dbC.connect( user, password );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getBillsData() throws SQLException {
		String billsID = "SELECT id FROM Bills WHERE Bills.id = id";
		PreparedStatement stmnt = conn.prepareStatement( billsID );
		ResultSet rs = stmnt.executeQuery();
		System.out.println( rs );
	}

}
