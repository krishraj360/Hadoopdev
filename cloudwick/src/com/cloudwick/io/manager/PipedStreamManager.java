package com.cloudwick.io.manager;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamManager {

	public static void main(String[] args) throws IOException {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream ois = new PipedOutputStream();

		pis.connect(ois);
		ois.write(123);
		ois.write(512);

		for (int i = 0; i < 2; i++) {
			System.out.println("Data read:" + pis.read());
		}

	}

}
