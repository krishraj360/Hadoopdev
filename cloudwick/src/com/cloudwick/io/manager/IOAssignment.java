package com.cloudwick.io.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOAssignment {

	public static void main(String[] args) throws IOException {

		IOAssignment obj = new IOAssignment();
		obj.readWriteContent("IOAssignment.txt", "IOout.txt");

	}

	public void readWriteContent(String fileread, String filewrite)
			throws IOException {

		FileReader fr = null;
		BufferedReader bufr = null;
		FileWriter fw = null;
		BufferedWriter bufw = null;

		String data = "";
		try {
			fr = new FileReader(fileread);
			bufr = new BufferedReader(fr);
			bufw = new BufferedWriter(new FileWriter(filewrite));
			while ((data = bufr.readLine()) != null) {

				String[] parts = data.split(",");
				if (parts[3].equals("94536")) {
					bufw.write(parts[0] + "," + parts[1] + "," + parts[2]
							+ "\n");
					bufw.flush();
				}

			}

		} finally {
			bufr.close();
			bufw.close();
		}

	}
}
