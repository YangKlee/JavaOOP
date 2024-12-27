/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package fa.training.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import fa.training.entities.Candidate;
import fa.training.entities.listCandidate;

public class threadReadFile extends Thread {
	public void run()
	{
		FileInputStream fin = null;
		ObjectInputStream OBJin = null;
		try {
			fin = new FileInputStream("src/data/data.dat");
			OBJin= new ObjectInputStream(fin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (fin.available() > 0)
			{
				listCandidate.add((Candidate)OBJin.readObject());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
