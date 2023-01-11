package pe.edu.idat.ws;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import pe.edu.idat.vo.PersonalVO;

@WebService(name = "IPersonalWS", targetNamespace = "http://ws.idat.edu.pe/")
public interface IPersonalWS {

	@WebMethod(operationName = "findByCorD", action = "urn:FindByCorD")
	@RequestWrapper(className = "pe.edu.idat.ws.jaxws.FindByCorD", localName = "findByCorD", targetNamespace = "http://ws.idat.edu.pe/")
	@ResponseWrapper(className = "pe.edu.idat.ws.jaxws.FindByCorDResponse", localName = "findByCorDResponse", targetNamespace = "http://ws.idat.edu.pe/")
	@WebResult(name = "return")
	Collection<PersonalVO> findByCorD(@WebParam(name = "arg0") String country, @WebParam(name = "arg1") String department);

}