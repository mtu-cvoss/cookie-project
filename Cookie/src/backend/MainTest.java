package backend;

import java.sql.SQLException;

public class MainTest {
	
	public static void main( String[] args ) throws SQLException {
		GetData bills = new GetData( "jmperttu", "cookieproject69" );
		System.out.println( bills.getOutflow() );
	}

}
