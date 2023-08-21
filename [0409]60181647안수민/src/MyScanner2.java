import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MyScanner2 {
	private File file;
	private FileReader fileReader;
	
	public MyScanner2(File list) throws FileNotFoundException {
		this.file = list;
		this.fileReader = new FileReader(file);
		}

	public boolean hasNext() throws IOException{
		boolean eof = false;
		int input = this.fileReader.read();
		System.out.println(input);
		if(input == -1) {
		this.fileReader.close();
		eof = true;
		}
		return eof;
	}
	public String next() throws IOException {
		String result = new String();
		boolean eos = false;
		while(!eos) {
				int input = this.fileReader.read();
				result = result + (char)input;
				System.out.println(input);
				if((input == 32) ||(input == 13)){					
					eos = true;
				}		
		}
		
	return result;
	}

	public int nextInt() throws IOException {
		String result = next();
		return 0;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}