import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test_result {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test_score") ); //텍스트 읽기
		double sum= 0;
		int i = 0;
		double result = 0;
		while(true) {
            String line = br.readLine();
            if (line==null) break; //공백 제거
            String num = line.substring(3); // 학생 이름 다음에 적인 점수 추출
            System.out.println(line); //점수 출력
            double score = Double.parseDouble(num); //점수 실수형으로 변환
            sum += score; //점수 총합
            i++; //학생 인원 세기
        }
		     result = sum/i; //평균
		     System.out.println("총점:"+sum); //총점 출력 
		     System.out.println("평균:" +result);//평균 출력
            br.close();
		
	}

}
