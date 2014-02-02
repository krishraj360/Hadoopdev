/*
 * in SAX events are triggered but no documents are created as in DOM
 * in SAX nothing is in memory
 */

package com.cloudwick.SAX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.cloudwick.domxml.Employee;

public class SaxPareserExample extends DefaultHandler {

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {

		SaxPareserExample obj = new SaxPareserExample();
		obj.parseXmlFile("Employees.xml");
		obj.printData();
	}

	List<Employee> emplist = new ArrayList<Employee>();
	Employee empobj;
	String elemval;

	public void parseXmlFile(String filename)
			throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		parser.parse(filename, this); // our handler is current class so this
										// keyword is used
	}

	// in employees.xml, qNmae -> person, attr -> type
	public void startElement(String uri, String localeName, String qName,
			Attributes attr) {
		elemval = "";
		if (qName.equals("Employee")) {
			empobj = new Employee();
			String type = attr.getValue("type");
			empobj.setType(type);
		}
	}

	public void characters(char[] ch, int start, int length) {
		elemval = new String(ch, start, length);
	}

	public void endElement(String uri, String localeName, String qName) {
		if(qName.equals("id")){
			empobj.setId(Integer.parseInt(elemval));		
		}
		else if(qName.equals("name")){
			empobj.setName(elemval);
		}
		else if(qName.equals("age")){
			empobj.setAge(Integer.parseInt(elemval));
		}
		else if(qName.equals("Employee")){
			emplist.add(empobj);
		}
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
