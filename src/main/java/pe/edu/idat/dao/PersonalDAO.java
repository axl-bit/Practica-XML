package pe.edu.idat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import pe.edu.idat.util.DBConnection;
import pe.edu.idat.vo.PersonalVO;

public class PersonalDAO {
	
public Collection<PersonalVO> findByCorD(String country, String department){
        
        Collection<PersonalVO> lista = new ArrayList<>();
        Connection cn;
        PreparedStatement stm;
        ResultSet rs;
        
        try {
            
            if(department.length() == 0){
                cn = DBConnection.getConnection();
                stm = cn.prepareStatement(
                        "SELECT * FROM personal WHERE country = ?");
                stm.setString(1, country);
                rs = stm.executeQuery();
                while(rs.next()){
                    PersonalVO vo = new PersonalVO(
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("email"),
                            rs.getString("street_name"),
                            rs.getString("country"),
                            rs.getString("department")
                    );
                    lista.add(vo);
                }           
            }else{
                cn = DBConnection.getConnection();
                stm = cn.prepareStatement(
                        "SELECT * FROM personal WHERE country = ? and department = ?");
                stm.setString(1, country);
                stm.setString(2, department);
                rs = stm.executeQuery();
                while(rs.next()){
                    PersonalVO vo = new PersonalVO(
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("email"),
                            rs.getString("street_name"),
                            rs.getString("country"),
                            rs.getString("department")
                    );
                    lista.add(vo);
                }
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }   

}
