
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;




public class savaPassenge {
	
	public static Connection getConnection(){
		
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:/airport","root","password");
     
            
        }catch(Exception e){System.out.println(e);}
        return con;
    }

	public static int save(save sv) {
		 int status = 0;
		 try{
			
				Connection con= savaPassenge.getConnection();
	            PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into emp(fname,password,username,origin,destination,age,"
	            		+ "date,national_id,gender,contract) values (?,?,?,?,?,?,?,?,?,?)");
	            ps.setString(1,sv.getFName());
	            ps.setString(2,sv.getPassword());
	            ps.setInt(7,sv.getDatee());
	            ps.setString(3,sv.getUser());
	            ps.setString(4,sv.getOrigin());
	            ps.setString(5,sv.getDestination());
	            ps.setInt(6,sv.getAge());
	            ps.setString(8,sv.getNational_id());
	            ps.setString(9,sv.getGender());
	            ps.setInt(10,sv.getContract());

	            status=ps.executeUpdate();

	            con.close();
	        }catch(Exception ex){ex.printStackTrace();}

	        return status;
	}
	        public static int update(save e){
	            int status=0;
	            try{
	                Connection con=savaPassenge.getConnection();
	                PreparedStatement ps=(PreparedStatement) con.prepareStatement( "update persenger_info set fname=?,username=?,contract=?,origin=?destination=?,national_id=?,opassword=?,date=?,gender=? where id=?");
	                ps.setString(1,e.getFName());
		            ps.setString(2,e.getPassword());
		            ps.setInt(7,e.getDatee());
		            ps.setString(3,e.getUser());
		            ps.setString(4,e.getOrigin());
		            ps.setString(5,e.getDestination());
		            ps.setInt(6,e.getAge());
		            ps.setString(8,e.getNational_id());
		            ps.setString(9,e.getGender());
		            ps.setInt(10,e.getContract());
		            status=ps.executeUpdate();

		            con.close();
		        }catch(Exception ex){ex.printStackTrace();}

		        return status;
		    }
	        
	        public static int delete(int id){
	            int status=0;
	            try{
	                Connection con=savaPassenge.getConnection();
	                PreparedStatement ps=(PreparedStatement) con.prepareStatement("delete from passenger_info where id=?");
	                ps.setInt(1,id);
	                status=ps.executeUpdate();

	                con.close();
	            }catch(Exception e){e.printStackTrace();}

	            return status;
	        }
	        
	        public static save getEmployeeById(int id){
	            save e=new save();

	            try{
	                Connection con=savaPassenge.getConnection();
	                PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from passenger_info where id=?");
	                ps.setInt(1,id);
	                ResultSet rs=ps.executeQuery();
	                if(rs.next()){
	                    e.setId(rs.getInt(1));
	                    e.setFName(rs.getString(2));
	                    e.setPassword(rs.getString(3));
	                    e.setDatee(rs.getInt(7));
	                    e.setOrigin(rs.getString(5));
	                    e.setUser(rs.getString(4));
	                    e.setDestination(rs.getString(6));
	                    e.setAge(rs.getInt(8));
	                    e.setNational_id(rs.getString(9));
	                    e.setGender(rs.getString(10));
	                    e.setContract(rs.getInt(11));
	                }
	                con.close();
	            }catch(Exception ex){ex.printStackTrace();}

	            return e;
	        }
      
	        public static List<save> getAllEmployees(){
	            List<save> list=new ArrayList<save>();

	            try{
	                Connection con=savaPassenge.getConnection();
	                PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from emp");
	                ResultSet rs=ps.executeQuery();
	                while(rs.next()){
	                    save e=new save();
	                    e.setId(rs.getInt(1));
	                    e.setFName(rs.getString(2));
	                    e.setPassword(rs.getString(3));
	                    e.setDatee(rs.getInt(7));
	                    e.setOrigin(rs.getString(5));
	                    e.setUser(rs.getString(4));
	                    e.setDestination(rs.getString(6));
	                    e.setAge(rs.getInt(8));
	                    e.setNational_id(rs.getString(9));
	                    e.setGender(rs.getString(10));
	                    e.setContract(rs.getInt(11));
	                    list.add(e);
	                }
	                con.close();
	            }catch(Exception e){e.printStackTrace();}

	            return list;

	        	}
	        }
