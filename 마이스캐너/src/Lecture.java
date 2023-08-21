

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
// Lecture : computerSum과 computerAverageFromFile라는 두개의 동사로 정의된 명사
// 아무거나 정의할 수 있음
public class Lecture {
	public void computeSum() { // '함수'라고 지칭!(f(x)같은거)
		// 항상 프로그래밍 할 때 : 결과를 저장할 저장소를 먼저 만들기!
		// 결과를 저장할 저장소를 정의,  초기화

		// 초기 조건 정의 -> 초기값을 안넣어주면 무엇을 넣어야할지 정해지지 않아서 오류
		int sum = 0;
		// 계산에 필요한 변수를 정의
		int index = 0; // 반복시 항상 0에서 시작하는 것이 좋음

		// 쉬운 프로그램도 복습해볼 필요가 있음

		while(index < 10) { // () <- 끝나는 조건, <= -> 두번 비교하게 함(크기 비교 및 같은지 확인

			//  반복 업무
			sum = sum + index;
			// 다음 조건으로 넘어가는 행위
			index = index + 1; 
		}

		int sum1 = 0; // 위에서 결과메모리에 45가 저장되어있으므로, 항상 다시 초기화 시켜주어야한다!
		for(int index1 = 0; index1 < 10; index1 = index1 +1) { // 그래서 적어도 for문은 3~4줄정도 됨, index는 사실상 for괄호 내에 있다.
			// 변수 이름을 비슷하게 짓지 말 것(index01, index02... -> X)
			//for(초기조건, 조건, 증감(변화)조건) {}
			sum1 = sum1 + index;
		}
	}
	// 함수를 새로 만들어 분리시킬것!
	//entry point
	public	 void computerAverageUsingScanner() throws FileNotFoundException {
		// top-down -> 만들 함수를 먼저 호출하여 자동으로 만들게함 (대세)
		File file; //-> 메모리 할당 및 주소지정
		file = new File("score.txt"); //-> File을 Open함 -> 더 특정한 정보 = Parameter
		// new : 1. 메모리 공간 확보, 2. 메모리 시작 주소를 'file'이름에 가져다줌
		// 에러나는 이유 : 읽어올 파일이름을 만들지 않았다.
		Scanner scanner = new Scanner(file); //파일을 직접읽어오는것이 아니라, 받은 것을 읽어서 번역만 해주는 것
		//scanner.delimiter(); 구문 인식 기준 세우기
		//기본 delimiter : 띄워쓰기, 라인피드, 리턴캐리지

		String names[] = new String[10];	// 시작주소 + 몇번째 주소  => HDD의 파일을 메모리로 올리기 위함임 
		float scores[] = new float[10]; // 10개를 만들라는 소리     => HDD의 파일을 메모리로 올리기 위함임
		char grades[] = new char[10];// 계산해서 저장하기 위함
		//0~9번 까지의 메모리 할당
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) { //->boolean
			names[count] = scanner.next();//String을 읽는 것 -> Space나 캐릭터 리턴, 엔드오브 파일 등까지 / 메모리 이미 확보됨
			scores[count] = scanner.nextFloat();//문자열로 읽고 이것을 Float로 변환해라
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
		for(int i=0; i<count;i++) {//count갯수만큼 돔
			System.out.print(names[i]);
			System.out.print(scores[i]);//Carriage Return + Line Feed = ln = "\n"
			System.out.println(grades[i]);
		}
		avg = sum/count; // -> 0으로 나눠질 수 있는 문제가 있음!! -> 해결하는 것이 숙제
		System.out.println("\r\n"+avg);

		//String name1 = scanner.next();// 다음꺼 까지 읽어옴
		//float score1 = scanner.nextFloat();

		scanner.close(); //미리 해둘 것, 그리고 이 사이에 코딩하기


	}
	public void computerAverageUsingMyScanner() throws IOException {
		File file; //-> 메모리 할당 및 주소지정
		file = new File("score.txt"); //-> File을 Open함 -> 더 특정한 정보 = Parameter
		// new : 1. 메모리 공간 확보, 2. 메모리 시작 주소를 'file'이름에 가져다줌
		// 에러나는 이유 : 읽어올 파일이름을 만들지 않았다.
		MyScanner scanner = new MyScanner(file); //파일을 직접읽어오는것이 아니라, 받은 것을 읽어서 번역만 해주는 것
		//scanner.delimiter(); 구문 인식 기준 세우기
		//기본 delimiter : 띄워쓰기, 라인피드, 리턴캐리지

		String names[] = new String[10];	// 시작주소 + 몇번째 주소  => HDD의 파일을 메모리로 올리기 위함임 
		float scores[] = new float[10]; // 10개를 만들라는 소리     => HDD의 파일을 메모리로 올리기 위함임
		char grades[] = new char[10];// 계산해서 저장하기 위함
		//0~9번 까지의 메모리 할당
		int count = 0;
		float sum = 0;
		float avg = 0;

		while(scanner.hasNext()) { //->boolean
			names[count] = scanner.next();//String을 읽는 것 -> Space나 캐릭터 리턴, 엔드오브 파일 등까지 / 메모리 이미 확보됨
			scores[count] = scanner.nextInt();//문자열로 읽고 이것을 Float로 변환해라
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
		for(int i=0; i<count;i++) {//count갯수만큼 돔
			System.out.print(names[i]);
			System.out.print(scores[i]);//Carriage Return + Line Feed = ln = "\n"
			System.out.println(grades[i]);
		}
		avg = sum/count; // -> 0으로 나눠질 수 있는 문제가 있음!! -> 해결하는 것이 숙제
		System.out.println("\r\n"+avg);

		//String name1 = scanner.next();// 다음꺼 까지 읽어옴
		//float score1 = scanner.nextFloat();

		scanner.close(); //미리 해둘 것, 그리고 이 사이에 코딩하기


	}
		
}
