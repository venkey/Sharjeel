package com.example.conversion.services;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.example.conversion.model.StudentBean;

@Service
public class DemoDaoService {

	public List<StudentBean> xmlTojavaObj() throws Exception {
		ClassPathResource resource = new ClassPathResource("student.xml");
		InputStream inputStream = resource.getInputStream();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(inputStream);
		doc.getDocumentElement().normalize();
		List<StudentBean> stuList = new ArrayList<StudentBean>();
		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
		NodeList nodeList = doc.getElementsByTagName("student");
		for (int itr = 0; itr < nodeList.getLength(); itr++) {
			Node studentNode = nodeList.item(itr);
			if (studentNode.getNodeType() == Node.ELEMENT_NODE) {
				StudentBean stuBean = new StudentBean();
				Element studentElement = (Element) studentNode;
				stuBean.setId(studentElement.getElementsByTagName("id").item(0).getTextContent());
				stuBean.setFirstname(studentElement.getElementsByTagName("firstname").item(0).getTextContent());
				stuBean.setLastname(studentElement.getElementsByTagName("lastname").item(0).getTextContent());
				stuBean.setSubject(studentElement.getElementsByTagName("subject").item(0).getTextContent());
				stuBean.setMarks(studentElement.getElementsByTagName("marks").item(0).getTextContent());
				stuList.add(stuBean);
			}
		}
		return stuList;
	}

}
