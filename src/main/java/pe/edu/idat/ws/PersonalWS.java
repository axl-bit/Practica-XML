package pe.edu.idat.ws;

import java.util.Collection;

import javax.jws.WebService;

import pe.edu.idat.controller.PersonalController;
import pe.edu.idat.vo.PersonalVO;

@WebService(targetNamespace = "http://ws.idat.edu.pe/", endpointInterface = "pe.edu.idat.ws.IPersonalWS", portName = "PersonalWSPort", serviceName = "PersonalWSService")
public class PersonalWS implements IPersonalWS {
	
	PersonalController controller = new PersonalController();
	
	public Collection<PersonalVO> findByCorD(String country, String department) {
        return controller.findByCorD(country, department);
    }

	
}
