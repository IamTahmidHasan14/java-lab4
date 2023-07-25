package lab4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class IO {
	private static final BufferedReader reader;
	static {
		try {
			FileInputStream instream = new FileInputStream("G:\\VARENDRA UNIVERSITY\\Programming in Java\\NetBeans\\Lab4\\src\\lab4\\in.txt");
			System.setIn(instream);
		} 
		catch(IOException e) {
		   System.err.println(e);
		}
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static String readLine() {
		try {
			return reader.readLine().trim();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
