import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test_result {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test_score") ); //�ؽ�Ʈ �б�
		double sum= 0;
		int i = 0;
		double result = 0;
		while(true) {
            String line = br.readLine();
            if (line==null) break; //���� ����
            String num = line.substring(3); // �л� �̸� ������ ���� ���� ����
            System.out.println(line); //���� ���
            double score = Double.parseDouble(num); //���� �Ǽ������� ��ȯ
            sum += score; //���� ����
            i++; //�л� �ο� ����
        }
		     result = sum/i; //���
		     System.out.println("����:"+sum); //���� ��� 
		     System.out.println("���:" +result);//��� ���
            br.close();
		
	}

}
