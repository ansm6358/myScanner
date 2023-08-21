import java.util.Scanner;

public class 과제2_1부터_n까지의_합 {

	public static void main(String[] args) {
	 Scanner a = new Scanner(System.in);
	 System.out.print("입력:");
	int n = a.nextInt();
     int sum=0;
     for(int i=1; i<= n; i++) {
    	 sum += i;
     }
     System.out.println("1부터 n까지의 합:" +sum);
	}

}
