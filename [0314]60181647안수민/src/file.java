import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

public class file {

	public static void main(String[] args) throws IOException  {
	File myFile = new File("test.txt");
		FileReader fr = new FileReader(myFile);
	
	int readtest;
	int sum = 0;
	int i = 0;
	int avg = 0;
	char[] cbuf = new char[3]; //3바이트씩 읽기
	while ((readtest=fr.read(cbuf)) != -1) {
		String data = new String(cbuf, 0, readtest);
		data = data.trim(); //data의 공백 제거
		int num = Integer.parseInt(data); //문자형을 정수형으로 변환
		sum += num; //점수 총합 계산
		i++; //점수들의 갯수 세기
	}
	avg = sum/i; //평균 계산
	File a = new File("result.txt"); //저장할 파일
	FileWriter fw = new FileWriter(a);
	fw.write("총점:"+sum);
	fw.write("\r\n");
	fw.write("평균:"+avg);
	fw.flush();
	fr.close();
}
	
}