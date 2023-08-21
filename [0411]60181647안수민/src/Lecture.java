

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lecture {
	public void computeSum() { 
		int sum = 0;
		int index = 0;

		while(index < 10) {       
			sum = sum + index;      //숫자를 계속 더하기
			index = index + 1; 
		}

		int sum1 = 0; 
		for(int index1 = 0; index1 < 10; index1 = index1 +1) {   //for을 이용해서 더 간단히
			sum1 = sum1 + index;
		}
	}
	public	 void computerAverageUsingScanner() throws FileNotFoundException {	
		File file; 
		file = new File("score.txt"); 
		Scanner scanner = new Scanner(file); 
		String names[] = new String[10];	//읽어올 만큼 배열 생성
		float scores[] = new float[10]; 
		char grades[] = new char[10];
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) {      //파일이 있으면 읽기
			names[count] = scanner.next();      //문자 저장
			scores[count] = scanner.nextFloat();  //실수형 저장
			if(scores[count]>90) {         //점수에 따른 등급
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
			sum = sum + scores[count];  //총합 구하기
			System.out.println(names[count]);  //이름 출력
			System.out.println(scores[count]);  //점수 출력
			count++;
		}
		
		System.out.println();
		for(int i=0; i<count;i++) {  //for문을 이용한 출력
			System.out.print(names[i]);
			System.out.print(scores[i]);
			System.out.println(grades[i]);
		}
		avg = sum/count;   //평균 내기
		System.out.println("\r\n"+avg);  //평균 출력
		scanner.close();


	}
	public void computerAverageUsingMyScanner() throws IOException {
		File file; 
		file = new File("score.txt"); 
		MyScanner scanner = new MyScanner(file);  //마이스캐너(정의 필요)

		String names[] = new String[10];	//배열 생성
		float scores[] = new float[10];
		char grades[] = new char[10];
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) {    //파일이 있으면 읽기
			names[count] = scanner.next();   //마이스캐너를 통해 배열 받기
			scores[count] = scanner.nextInt();  //마이스캐너를 통해 정수 받기
			if(scores[count]>90) {  //점수에 따른 등급
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
			sum = sum + scores[count];    //총합
			System.out.println(names[count]);
			System.out.println(scores[count]);
			count++; 
		}
		
		System.out.println();
		for(int i=0; i<count;i++) {  //출력
			System.out.print(names[i]);
			System.out.print(scores[i]);
			System.out.println(grades[i]);
		}
		avg = sum/count; //평균
		System.out.println("\r\n"+avg);

		scanner.close();  //마이스캐너 닫기


	}
		
}
