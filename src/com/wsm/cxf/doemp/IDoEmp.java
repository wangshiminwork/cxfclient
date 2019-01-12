package com.wsm.cxf.doemp;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-01-11T19:32:11.665+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://www.wsm.com/cxf/doemp", name = "IDoEmp")
@XmlSeeAlso({ObjectFactory.class})
public interface IDoEmp {

    @WebMethod
    @RequestWrapper(localName = "findAll", targetNamespace = "http://www.wsm.com/cxf/doemp", className = "com.wsm.cxf.doemp.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://www.wsm.com/cxf/doemp", className = "com.wsm.cxf.doemp.FindAllResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.wsm.cxf.doemp.Emp> findAll();
}