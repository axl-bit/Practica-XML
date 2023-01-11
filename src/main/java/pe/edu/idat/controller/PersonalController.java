package pe.edu.idat.controller;

import java.util.Collection;
import pe.edu.idat.dao.PersonalDAO;
import pe.edu.idat.vo.PersonalVO;

public class PersonalController {
	
private PersonalDAO dao = new PersonalDAO();
    
    public Collection<PersonalVO> findByCorD(String country, String department){
        return dao.findByCorD(country, department);
    }

}
