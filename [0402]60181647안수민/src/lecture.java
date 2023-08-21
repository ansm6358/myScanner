import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class lecture {

	public void main() throws FileNotFoundException {
		File test = new File("score.txt");
		Scanner sc = new Scanner(test);
		String name[] = new String [5]; //이름 배열 5가지
		char i = 0;
		int ii = 0;
		float score[] = new float[5]; //점수 배열 5가지 
		float sum = 0;
		int count = 0;
		while(sc.hasNext()) {
			name[i] = sc.next();			//이름 불러와 저장
			score[ii] = sc.nextFloat();		//점수 불러와 저장
			count= name.length;				//명수 세기
			sum=sum + score[ii];			//총합
			System.out.print(name[i]);	
			System.out.println("   "+score[ii]);
			i++;
			ii++;		
		}
		if(count == 0) {	//분모가 0일 경우 생기는 오류 처리
			System.out.println("데이터 파일이 없습니다. 데이터 파일을 입력하세요.");
			}		
		 else if(count>0){float average = sum/count;  //평균
		System.out.println("총합:  "+sum);
			System.out.println("평균:  "+average);
		}
	}

}
