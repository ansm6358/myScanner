import java.util.Scanner;

public class ����2_1����_n������_�� {

	public static void main(String[] args) {
	 Scanner a = new Scanner(System.in);
	 System.out.print("�Է�:");
	int n = a.nextInt();
     int sum=0;
     for(int i=1; i<= n; i++) {
    	 sum += i;
     }
     System.out.println("1���� n������ ��:" +sum);
	}

}
