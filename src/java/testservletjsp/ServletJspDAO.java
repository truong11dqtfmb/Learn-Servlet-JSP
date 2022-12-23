package testservletjsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ServletJspDAO {

    public List<ModelServletJSP> getAll() {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        List<ModelServletJSP> list = new ArrayList<>();

        con = DBConnect.open();

//        name quantity image status des dateadd
        String sql = "Select * From servletjsp";

        try {
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                ModelServletJSP p = new ModelServletJSP();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setImage(rs.getString("image"));
                p.setStatus(rs.getInt("status"));
                p.setDes(rs.getString("des"));
                p.setDateadd(rs.getString("dateadd"));

                list.add(p);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DBConnect.closeAll(con, stm, rs);
        }
        return null;
    }

    public ModelServletJSP findDatailByID(int id) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        con = DBConnect.open();

//        name quantity image status des dateadd
        String sql = "Select * From servletjsp Where id = ?";
        try {
            stm = con.prepareStatement(sql);
            stm.setInt(1, id);

            rs = stm.executeQuery();
            if (rs.next()) {
                ModelServletJSP p = new ModelServletJSP();
                p.setId(id);
                p.setName(rs.getString("name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setImage(rs.getString("image"));
                p.setStatus(rs.getInt("status"));
                p.setDes(rs.getString("des"));
                p.setDateadd(rs.getString("dateadd"));

                return p;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DBConnect.closeAll(con, stm, rs);
        }
        return null;
    }

    public boolean addServletJsp(ModelServletJSP p) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        con = DBConnect.open();

        String sql = "Insert Into servletjsp(name,quantity,image,status,des,dateadd) Values(?,?,?,?,?,?)";
//        name quantity image status des dateadd
        try {
            stm = con.prepareStatement(sql);
            stm.setString(1, p.getName());
            stm.setInt(2, p.getQuantity());
            stm.setString(3, p.getImage());
            stm.setInt(4, p.getStatus());
            stm.setString(5, p.getDes());
            stm.setString(6, p.getDateadd());

            return stm.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DBConnect.closeAll(con, stm, rs);
        }
        return false;
    }

    public boolean updateServletJsp(ModelServletJSP p) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        con = DBConnect.open();
        //        name quantity image status des dateadd
        String sql = "Update servletjsp Set name=?, quantity=?, image=?, status=?, des=?, dateadd=? Where id = ?";
        try {
            stm = con.prepareStatement(sql);
            stm.setString(1, p.getName());
            stm.setInt(2, p.getQuantity());
            stm.setString(3, p.getImage());
            stm.setInt(4, p.getStatus());
            stm.setString(5, p.getDes());
            stm.setString(6, p.getDateadd());
            stm.setInt(7, p.getId());

            return stm.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DBConnect.closeAll(con, stm, rs);
        }
        return false;
    }

    public boolean deleteServletJsp(int id) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        con = DBConnect.open();

        String sql = "Delete servletjsp Where id = ?";

        try {
            stm = con.prepareStatement(sql);
            stm.setInt(1, id);

            return stm.executeUpdate() > 0;

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DBConnect.closeAll(con, stm, rs);
        }
        return false;
    }
    
    public static void main(String[] args) {
        ServletJspDAO c = new ServletJspDAO();
//        c.getAll().forEach(System.out::println);

        List<ModelServletJSP> list = c.getAll();
        
        System.out.println(list.get(0).getName());
    }

}
