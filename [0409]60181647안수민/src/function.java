import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class function {

	public void array() throws FileNotFoundException {
		File test = new File("test.txt");
		Scanner sc = new Scanner(test);
		String name[] = new String [5]; //�̸� �迭 5����
		char i = 0;
		int ii = 0;
		float score[] = new float[5]; //���� �迭 5���� 
		float sum = 0;
		int count = 0;
		while(sc.hasNext()) {
			name[i] = sc.next();			//�̸� �ҷ��� ����
			score[ii] = sc.nextFloat();		//���� �ҷ��� ����
			count= name.length;				//��� ����
			sum=sum + score[ii];			//����
			System.out.print(name[i]);	
			System.out.println("   "+score[ii]);
			i++;
			ii++;		
		}
		if(count == 0) {	//�и� 0�� ��� ����� ���� ó��
			System.out.println("������ ������ �����ϴ�. ������ ������ �Է��ϼ���.");
			}		
		 else if(count>0){float average = sum/count;  //���
		System.out.println("����:  "+sum);
			System.out.println("���:  "+average);
		}

	}
	public void test() throws IOException {	
		File list = new File("test.txt");
		MyScanner sc = new MyScanner(list);
		String[] names = new String[5];
		float[] scores = new float[5];
		char[] grades = new char[5];
		int count = 0;
		float sum = 0;
		while(sc.hasNext()) {
			names[count] = sc.next();
			scores[count] = sc.nextInt();
			if(scores[count]<50){
				grades[count]='F';
			}
			else if (scores[count]<60){
				grades[count]='E';
			}
			else if (scores[count]<70){
				grades[count]='D';
			}
			else if (scores[count]<80){
				grades[count]='C';
			}
			else if (scores[count]<90){
				grades[count]='B';
			}
			else{
				grades[count]='A';
			}
			sum = sum + scores[count];
			count++;
		}
		for(int i = 0; i<count; i++) {
			System.out.print(names[i]);
			System.out.print("  "+scores[i]);			
			System.out.println("  "+grades[i]);
		}
		sc.close();
	}
}
