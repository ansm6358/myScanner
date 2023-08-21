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
		String temp = sc.nextLine();  //한 줄씩 읽어오기
		System.out.print(temp); //각각의 이름과 점수 출력
		temp = temp.replaceAll("[가-힣]",""); //읽어온 파일에서 한글제거
		double d =  Double.parseDouble(temp);  //남은 것을 실수 데이터 형으로 변환
		if(d >= 90) {  //조건문으로 점수에 따라 등급 메기기
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
		System.out.println("  등급:"+result); //등급 출력
		}
		}	

	}


