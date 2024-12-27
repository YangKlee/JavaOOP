/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package fa.training.services;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import fa.training.entities.*;
public class threadWriteFile extends Thread {
	public void run()
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("src/data/data.dat");
			ObjectOutputStream OBJout = null;
			try {
				OBJout = new ObjectOutputStream(fout);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < listCandidate.size(); i++)
			{
				try {
					OBJout.writeObject(listCandidate.get(i));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OBJout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException E)
		{
			E.printStackTrace();
		}
		
	}
	
}
