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
		String temp = sc.nextLine();  //ÇÑ ÁÙ¾¿ ÀÐ¾î¿À±â
		System.out.print(temp); //°¢°¢ÀÇ ÀÌ¸§°ú Á¡¼ö Ãâ·Â
		temp = temp.replaceAll("[°¡-ÆR]",""); //ÀÐ¾î¿Â ÆÄÀÏ¿¡¼­ ÇÑ±ÛÁ¦°Å
		double d =  Double.parseDouble(temp);  //³²Àº °ÍÀ» ½Ç¼ö µ¥ÀÌÅÍ ÇüÀ¸·Î º¯È¯
		if(d >= 90) {  //Á¶°Ç¹®À¸·Î Á¡¼ö¿¡ µû¶ó µî±Þ ¸Þ±â±â
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
		System.out.println("  µî±Þ:"+result); //µî±Þ Ãâ·Â
		}
		}	

	}


