import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class compare {

	public static void main(
) throws FileNotFoundException {
		File list = new File("test.txt");
		Scanner sc = new Scanner(list);
		String[] names = new String[5];
		float[] scores = new float[5];
		char[] grades = new char[5];
		int count = 0;
		float sum = 0;
		while(sc.hasNext()) {
			names[count] = sc.next();
			scores[count] = sc.nextFloat();
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
