


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyScanner {
	
	private FileReader fileReader;

	public MyScanner(File file) throws FileNotFoundException
	{
	this.fileReader = new FileReader(file);		
	}
	String first_word = "";
	public boolean hasNext() throws IOException {
		boolean eof = true;

		int input = this.fileReader.read();
		first_word = first_word + (char)input;
		if(input==-1) {
			this.fileReader.close();
			eof = false;
		}
		return eof;
	}
	public String next() throws IOException {		
		String result = new String();
		boolean eos = false;
		while(!eos) {
		int input = this.fileReader.read();
		if(input == -1) {
			input= 32;
		}
		result = result + first_word;
			first_word = "";		
		result = result + (char)input;
		if((input==10) || (input==32)||(input == -1)) {
			result= result.replaceAll(" ","");
			result= result.replaceAll("\r","");
			result= result.replaceAll("\n","");

			eos = true;
		}
	}
		return result;
	}
	public int nextInt() throws IOException {
		String result = next();
		
		return Integer.parseInt(result);
	}
	public void close() throws IOException {
		
		int input = this.fileReader.read();
		
	}

}
