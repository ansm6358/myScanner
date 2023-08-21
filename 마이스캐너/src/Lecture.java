

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
// Lecture : computerSum�� computerAverageFromFile��� �ΰ��� ����� ���ǵ� ���
// �ƹ��ų� ������ �� ����
public class Lecture {
	public void computeSum() { // '�Լ�'��� ��Ī!(f(x)������)
		// �׻� ���α׷��� �� �� : ����� ������ ����Ҹ� ���� �����!
		// ����� ������ ����Ҹ� ����,  �ʱ�ȭ

		// �ʱ� ���� ���� -> �ʱⰪ�� �ȳ־��ָ� ������ �־������ �������� �ʾƼ� ����
		int sum = 0;
		// ��꿡 �ʿ��� ������ ����
		int index = 0; // �ݺ��� �׻� 0���� �����ϴ� ���� ����

		// ���� ���α׷��� �����غ� �ʿ䰡 ����

		while(index < 10) { // () <- ������ ����, <= -> �ι� ���ϰ� ��(ũ�� �� �� ������ Ȯ��

			//  �ݺ� ����
			sum = sum + index;
			// ���� �������� �Ѿ�� ����
			index = index + 1; 
		}

		int sum1 = 0; // ������ ����޸𸮿� 45�� ����Ǿ������Ƿ�, �׻� �ٽ� �ʱ�ȭ �����־���Ѵ�!
		for(int index1 = 0; index1 < 10; index1 = index1 +1) { // �׷��� ��� for���� 3~4������ ��, index�� ��ǻ� for��ȣ ���� �ִ�.
			// ���� �̸��� ����ϰ� ���� �� ��(index01, index02... -> X)
			//for(�ʱ�����, ����, ����(��ȭ)����) {}
			sum1 = sum1 + index;
		}
	}
	// �Լ��� ���� ����� �и���ų��!
	//entry point
	public	 void computerAverageUsingScanner() throws FileNotFoundException {
		// top-down -> ���� �Լ��� ���� ȣ���Ͽ� �ڵ����� ������� (�뼼)
		File file; //-> �޸� �Ҵ� �� �ּ�����
		file = new File("score.txt"); //-> File�� Open�� -> �� Ư���� ���� = Parameter
		// new : 1. �޸� ���� Ȯ��, 2. �޸� ���� �ּҸ� 'file'�̸��� ��������
		// �������� ���� : �о�� �����̸��� ������ �ʾҴ�.
		Scanner scanner = new Scanner(file); //������ �����о���°��� �ƴ϶�, ���� ���� �о ������ ���ִ� ��
		//scanner.delimiter(); ���� �ν� ���� �����
		//�⺻ delimiter : �������, �����ǵ�, ����ĳ����

		String names[] = new String[10];	// �����ּ� + ���° �ּ�  => HDD�� ������ �޸𸮷� �ø��� ������ 
		float scores[] = new float[10]; // 10���� ������ �Ҹ�     => HDD�� ������ �޸𸮷� �ø��� ������
		char grades[] = new char[10];// ����ؼ� �����ϱ� ����
		//0~9�� ������ �޸� �Ҵ�
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) { //->boolean
			names[count] = scanner.next();//String�� �д� �� -> Space�� ĳ���� ����, ������� ���� ����� / �޸� �̹� Ȯ����
			scores[count] = scanner.nextFloat();//���ڿ��� �а� �̰��� Float�� ��ȯ�ض�
			if(scores[count]>90) {
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
			sum = sum + scores[count];
			System.out.println(names[count]);
			System.out.println(scores[count]);
			count++; //count = count + 1;
		}
		
		System.out.println();
		for(int i=0; i<count;i++) {//count������ŭ ��
			System.out.print(names[i]);
			System.out.print(scores[i]);//Carriage Return + Line Feed = ln = "\n"
			System.out.println(grades[i]);
		}
		avg = sum/count; // -> 0���� ������ �� �ִ� ������ ����!! -> �ذ��ϴ� ���� ����
		System.out.println("\r\n"+avg);

		//String name1 = scanner.next();// ������ ���� �о��
		//float score1 = scanner.nextFloat();

		scanner.close(); //�̸� �ص� ��, �׸��� �� ���̿� �ڵ��ϱ�


	}
	public void computerAverageUsingMyScanner() throws IOException {
		File file; //-> �޸� �Ҵ� �� �ּ�����
		file = new File("score.txt"); //-> File�� Open�� -> �� Ư���� ���� = Parameter
		// new : 1. �޸� ���� Ȯ��, 2. �޸� ���� �ּҸ� 'file'�̸��� ��������
		// �������� ���� : �о�� �����̸��� ������ �ʾҴ�.
		MyScanner scanner = new MyScanner(file); //������ �����о���°��� �ƴ϶�, ���� ���� �о ������ ���ִ� ��
		//scanner.delimiter(); ���� �ν� ���� �����
		//�⺻ delimiter : �������, �����ǵ�, ����ĳ����

		String names[] = new String[10];	// �����ּ� + ���° �ּ�  => HDD�� ������ �޸𸮷� �ø��� ������ 
		float scores[] = new float[10]; // 10���� ������ �Ҹ�     => HDD�� ������ �޸𸮷� �ø��� ������
		char grades[] = new char[10];// ����ؼ� �����ϱ� ����
		//0~9�� ������ �޸� �Ҵ�
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) { //->boolean
			names[count] = scanner.next();//String�� �д� �� -> Space�� ĳ���� ����, ������� ���� ����� / �޸� �̹� Ȯ����
			scores[count] = scanner.nextInt();//���ڿ��� �а� �̰��� Float�� ��ȯ�ض�
			if(scores[count]>90) {
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
			sum = sum + scores[count];
			System.out.println(names[count]);
			System.out.println(scores[count]);
			count++; //count = count + 1;
		}
		
		System.out.println();
		for(int i=0; i<count;i++) {//count������ŭ ��
			System.out.print(names[i]);
			System.out.print(scores[i]);//Carriage Return + Line Feed = ln = "\n"
			System.out.println(grades[i]);
		}
		avg = sum/count; // -> 0���� ������ �� �ִ� ������ ����!! -> �ذ��ϴ� ���� ����
		System.out.println("\r\n"+avg);

		//String name1 = scanner.next();// ������ ���� �о��
		//float score1 = scanner.nextFloat();

		scanner.close(); //�̸� �ص� ��, �׸��� �� ���̿� �ڵ��ϱ�


	}
		
}
