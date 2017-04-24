package english.mooc.roxage;

import java.io.*;

public class Test {
	public static void main(String [] args){
		int c;
		try{
			InputStream in = new FileInputStream( "src/english/mooc/roxage/roxage.txt" );
			in = new BufferedInputStream( in ); // decoration
			in = new LowerCaseInputStream( in ); // decoration

			while( (c = in.read()) >= 0 ){
				System.out.print( (char)c );
			}
			in.close();
		}catch( IOException e){
			e.printStackTrace();
		}
	}
}