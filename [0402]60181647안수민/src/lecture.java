import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class lecture {

	public void main() throws FileNotFoundException {
		File test = new File("score.txt");
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

}
