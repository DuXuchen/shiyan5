package shiyan4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class ZhuceListener implements ActionListener{
	FileReader r_file;
	FileReader w_file;
	BufferedReader buf_reader;
	BufferedWriter buf_writer;
	public void actionPerformed(ActionEvent e) {
		File f = new File("D:/jtest/","a.txt");
		try {
			r_file = new FileReader(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		buf_reader = new BufferedReader(r_file);  
	}
	public void writeFile() {
		try {
			w_file = new FileWriter("b.txt");
			buf_writer = new BufferedWriter(w_file);
			String str = txt.getText();
			buf_writer.write(str,0,str.length());
			buf_writer.flush();
		}
		catch(IOException ew) {System.out.println(ew);}
	}
}
