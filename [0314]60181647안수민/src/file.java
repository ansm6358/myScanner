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
	char[] cbuf = new char[3]; //3����Ʈ�� �б�
	while ((readtest=fr.read(cbuf)) != -1) {
		String data = new String(cbuf, 0, readtest);
		data = data.trim(); //data�� ���� ����
		int num = Integer.parseInt(data); //�������� ���������� ��ȯ
		sum += num; //���� ���� ���
		i++; //�������� ���� ����
	}
	avg = sum/i; //��� ���
	File a = new File("result.txt"); //������ ����
	FileWriter fw = new FileWriter(a);
	fw.write("����:"+sum);
	fw.write("\r\n");
	fw.write("���:"+avg);
	fw.flush();
	fr.close();
}
	
}