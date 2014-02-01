package com.cloudwick.domxml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomExample {
	private Document doc;
	private List<Employee> emplist = new ArrayList<Employee>();

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {
		DomExample obj = new DomExample();
		obj.parseXmlFile("Employees.xml");
		obj.parseDocument();
		obj.printData();

	}

	public void parseXmlFile(String filename)
			throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		doc = builder.parse(filename);
	}

	public void parseDocument() {
		Element rootel = doc.getDocumentElement();
		NodeList empnodelist = rootel.getElementsByTagName("Employee");
		for (int i = 0; i < empnodelist.getLength(); i++) {
			Element emp = (Element) empnodelist.item(i);
			Employee empobj = getEmployee(emp);
			emplist.add(empobj);
		}
	}

	public Employee getEmployee(Element emp) {
		Employee empobj = new Employee();
		String type = emp.getAttribute("type");

		NodeList idlist = emp.getElementsByTagName("id");
		Element idElem = (Element) idlist.item(0);
		int id = Integer.parseInt(idElem.getFirstChild().getNodeValue());

		NodeList agelist = emp.getElementsByTagName("age");
		Element ageElem = (Element) agelist.item(0);
		int age = Integer.parseInt(ageElem.getFirstChild().getNodeValue());

		NodeList namelist = emp.getElementsByTagName("name");
		Element nameElem = (Element) namelist.item(0);
		String name = nameElem.getFirstChild().getNodeValue();

		empobj.setAge(age);
		empobj.setId(id);
		empobj.setName(name);

		return empobj;

	}

	public void printData() {
		for (Employee emp : emplist) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getAge());
			System.out.println(emp.getType());
		}
	}
}
