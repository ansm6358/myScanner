import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class score {

	public static void main(String[] args) throws FileNotFoundException {
		File pt = new File("test.txt");
		FileReader fr = new FileReader(pt);
		Scanner sc = new Scanner(fr);
		char result = 0; 
		
		while(sc.hasNext()) {
		String temp = sc.nextLine();  //�� �پ� �о����
		System.out.print(temp); //������ �̸��� ���� ���
		temp = temp.replaceAll("[��-�R]",""); //�о�� ���Ͽ��� �ѱ�����
		double d =  Double.parseDouble(temp);  //���� ���� �Ǽ� ������ ������ ��ȯ
		if(d >= 90) {  //���ǹ����� ������ ���� ��� �ޱ��
		result ='A';		
		}
		else if(d >= 80){		
		 result = 'B';
		}
		else if(d >= 70){		
			 result = 'C';
			}
		else if(d >= 60){		
				 result = 'D';
			}
		else if(d >= 50){		
			 result = 'E';
			}
		else if(d < 50){		
			 result = 'F';
			}
		System.out.println("  ���:"+result); //��� ���
		}
		}	

	}


