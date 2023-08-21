


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyScanner {
	
	private FileReader fileReader;

	public MyScanner(File file) throws FileNotFoundException
	{
	this.fileReader = new FileReader(file);		//파일리더 생성
	}
	String first_word = "";  //첫글자 저장할 string 
	public boolean hasNext() throws IOException {
		boolean eof = true;  //읽을 데이터 있으면 진행
		int input = this.fileReader.read(); //읽은 파일 인트형(아스키코드)으로 저장
		first_word = first_word + (char)input; //첫글자 저장
		if(input==-1) {
			this.fileReader.close(); // -1이 나오면 파일리더 닫기
			eof = false;  //파일 읽기 멈추기
		}
		return eof;
	}
	public String next() throws IOException {		
		String result = new String();
		boolean eos = false;   
		while(!eos) {   //eos가 false면 진행
		int input = this.fileReader.read();
		if(input == -1) {    //-1이 나오면 스페이스로 변환
			input= 32;
		}
		result = result + first_word;   //첫글자 저장
			first_word = "";		//다음 단어에 첫글자를 저장하지 않게 변경
		result = result + (char)input;  //글자 이어서 저장
		if((input==10) || (input==32)||(input == -1)) {  //32, 10, -1이 나오면 띄어쓰기 캐리지리턴, 라인 필드 제거
			result= result.replaceAll(" ","");
			result= result.replaceAll("\r","");
			result= result.replaceAll("\n","");

			eos = true;
		}
	}
		return result;   //저장된 문자열 전달
	}
	public int nextInt() throws IOException {
		String result = next();  //next에서 읽은거 받기
		return Integer.parseInt(result);  //정수형으로 변환
	}
	public void close() throws IOException {
		
		fileReader.close();  //파일 닫기
		
	}

}
