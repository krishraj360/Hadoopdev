package com.cloudwick.domxml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DomExample {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DomExample obj = new DomExample();
		obj.parseXmlFile("Employees.xml");

	}

	public void parseXmlFile(String filename)
			throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(filename);
	}

}
