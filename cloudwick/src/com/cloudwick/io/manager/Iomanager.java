package com.cloudwick.io.manager;

import com.cloudwick.io.exception.FileAlreadyExistException;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Iomanager {

	public static void main(String[] args) throws FileAlreadyExistException,
			IOException {

		Iomanager obj = new Iomanager();
		// obj.createFile("saikiran.txt");
		obj.writeContent("Saikiran.txt");
		obj.readContent("saikiran.txt");
	}

	public void createFile(String filename) throws FileAlreadyExistException,
			IOException {

		File fobj = new File(filename);
		if (fobj.exists()) {
			throw new FileAlreadyExistException("File already exists");

		} else {
			fobj.createNewFile();
		}
	}

	public void writeContent(String filename) throws IOException {

		FileOutputStream fout = null;
		BufferedOutputStream bufout = null;
		try {
			fout = new FileOutputStream(filename);
			bufout = new BufferedOutputStream(fout, 512);
			String data = "I live in fremont";
			bufout.write(data.getBytes());
			bufout.flush();
		} finally {
			if (fout != null) {
				fout.close();
			}
		}

	}

	public void readContent(String filename) throws IOException {

		FileInputStream fin = null;
		BufferedInputStream bufin = null;
		byte data;
		try {
			fin = new FileInputStream(filename);
			bufin = new BufferedInputStream(fin);

			while ((data = (byte) bufin.read()) != -1) {
				System.out.print((char) data);
			}
		} finally {
			if (fin != null) {
				fin.close();
			}
		}

	}

}
