


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyScanner {
	
	private FileReader fileReader;

	public MyScanner(File file) throws FileNotFoundException
	{
	this.fileReader = new FileReader(file);		//���ϸ��� ����
	}
	String first_word = "";  //ù���� ������ string 
	public boolean hasNext() throws IOException {
		boolean eof = true;  //���� ������ ������ ����
		int input = this.fileReader.read(); //���� ���� ��Ʈ��(�ƽ�Ű�ڵ�)���� ����
		first_word = first_word + (char)input; //ù���� ����
		if(input==-1) {
			this.fileReader.close(); // -1�� ������ ���ϸ��� �ݱ�
			eof = false;  //���� �б� ���߱�
		}
		return eof;
	}
	public String next() throws IOException {		
		String result = new String();
		boolean eos = false;   
		while(!eos) {   //eos�� false�� ����
		int input = this.fileReader.read();
		if(input == -1) {    //-1�� ������ �����̽��� ��ȯ
			input= 32;
		}
		result = result + first_word;   //ù���� ����
			first_word = "";		//���� �ܾ ù���ڸ� �������� �ʰ� ����
		result = result + (char)input;  //���� �̾ ����
		if((input==10) || (input==32)||(input == -1)) {  //32, 10, -1�� ������ ���� ĳ��������, ���� �ʵ� ����
			result= result.replaceAll(" ","");
			result= result.replaceAll("\r","");
			result= result.replaceAll("\n","");

			eos = true;
		}
	}
		return result;   //����� ���ڿ� ����
	}
	public int nextInt() throws IOException {
		String result = next();  //next���� ������ �ޱ�
		return Integer.parseInt(result);  //���������� ��ȯ
	}
	public void close() throws IOException {
		
		fileReader.close();  //���� �ݱ�
		
	}

}
