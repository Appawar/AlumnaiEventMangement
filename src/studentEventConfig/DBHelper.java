package studentEventConfig;

import java.sql.*;

public class DBHelper {
	
	protected DBConfig db = DBConfig.getDBConfigration();
	protected Connection conn = DBConfig.getConnection();
	protected PreparedStatement stmt = DBConfig.getPreparedStatement();
	protected ResultSet rs = DBConfig.getResultSet();
 
}
