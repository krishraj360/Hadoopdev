package com.cloudwick.Json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonExample {

	public static void main(String[] args) throws IOException, ParseException {

		JsonExample obj = new JsonExample();
		obj.createJsonFile("Employee.json");
		obj.readJsonFile("Employee.json");
	}

	public void createJsonFile(String filename) throws IOException {
		JSONObject obj = new JSONObject();
		obj.put("name", "sai");
		obj.put("age", new Integer(24));

		JSONArray arr = new JSONArray();
		arr.add("val1");
		arr.add("val2");
		arr.add("val3");

		obj.put("details", arr);

		FileWriter wrt = new FileWriter(filename);
		wrt.write(obj.toJSONString());
		wrt.flush();
		wrt.close();
	}

	public void readJsonFile(String filename) throws FileNotFoundException,
			IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(filename));
		JSONObject obj2 = (JSONObject) obj;
		Long age = (Long)obj2.get("age");
		String name = (String)obj2.get("name");
		JSONArray detArr = (JSONArray)obj2.get("details");
		Iterator<String> detIter = detArr.iterator();
		while(detIter.hasNext()){
		String details = detIter.next();
		System.out.println(details);
		}
		System.out.println(name);
		System.out.println(age);
		
	}

}
