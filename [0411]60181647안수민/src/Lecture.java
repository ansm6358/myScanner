

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lecture {
	public void computeSum() { 
		int sum = 0;
		int index = 0;

		while(index < 10) {       
			sum = sum + index;      //���ڸ� ��� ���ϱ�
			index = index + 1; 
		}

		int sum1 = 0; 
		for(int index1 = 0; index1 < 10; index1 = index1 +1) {   //for�� �̿��ؼ� �� ������
			sum1 = sum1 + index;
		}
	}
	public	 void computerAverageUsingScanner() throws FileNotFoundException {	
		File file; 
		file = new File("score.txt"); 
		Scanner scanner = new Scanner(file); 
		String names[] = new String[10];	//�о�� ��ŭ �迭 ����
		float scores[] = new float[10]; 
		char grades[] = new char[10];
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) {      //������ ������ �б�
			names[count] = scanner.next();      //���� ����
			scores[count] = scanner.nextFloat();  //�Ǽ��� ����
			if(scores[count]>90) {         //������ ���� ���
				grades[count]='A';
			}else if(scores[count]>80) {
				grades[count]='B';
			}else if(scores[count]>70) {
				grades[count]='C';
			}else if(scores[count]>60) {
				grades[count]='D';
			}else{
				grades[count]='F';
			}
			sum = sum + scores[count];  //���� ���ϱ�
			System.out.println(names[count]);  //�̸� ���
			System.out.println(scores[count]);  //���� ���
			count++;
		}
		
		System.out.println();
		for(int i=0; i<count;i++) {  //for���� �̿��� ���
			System.out.print(names[i]);
			System.out.print(scores[i]);
			System.out.println(grades[i]);
		}
		avg = sum/count;   //��� ����
		System.out.println("\r\n"+avg);  //��� ���
		scanner.close();


	}
	public void computerAverageUsingMyScanner() throws IOException {
		File file; 
		file = new File("score.txt"); 
		MyScanner scanner = new MyScanner(file);  //���̽�ĳ��(���� �ʿ�)

		String names[] = new String[10];	//�迭 ����
		float scores[] = new float[10];
		char grades[] = new char[10];
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) {    //������ ������ �б�
			names[count] = scanner.next();   //���̽�ĳ�ʸ� ���� �迭 �ޱ�
			scores[count] = scanner.nextInt();  //���̽�ĳ�ʸ� ���� ���� �ޱ�
			if(scores[count]>90) {  //������ ���� ���
				grades[count]='A';
			}else if(scores[count]>80) {
				grades[count]='B';
			}else if(scores[count]>70) {
				grades[count]='C';
			}else if(scores[count]>60) {
				grades[count]='D';
			}else{
				grades[count]='F';
			}
			sum = sum + scores[count];    //����
			System.out.println(names[count]);
			System.out.println(scores[count]);
			count++; 
		}
		
		System.out.println();
		for(int i=0; i<count;i++) {  //���
			System.out.print(names[i]);
			System.out.print(scores[i]);
			System.out.println(grades[i]);
		}
		avg = sum/count; //���
		System.out.println("\r\n"+avg);

		scanner.close();  //���̽�ĳ�� �ݱ�


	}
		
}
