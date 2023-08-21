import java.awt.List;
import java.io.File;
import java.util.ArrayList;

public class MyScanner {
	private File file;
	char c;
	String s;
	String a;
	int b;
	float f;
	ArrayList<String> list1 = new ArrayList<>();
	ArrayList<String> list2 = new ArrayList<>();
	ArrayList<String> list3 = new ArrayList<>();
	public MyScanner(File list) {
		this.file = list;
		}

	public boolean hasNext() {
if(file != null) {
	return true;
}
	else{
		return false;
				}
	}

	public String next() {
		for(int i=0;i<file.length();i++){
			 c = ((CharSequence) file).charAt(i);
			 if(c != 10 || c != 32){//문자인 경우
				s = Character.toString((char)c); 
	       list1.add(s);
	       a += list1.get(i);
	    
			 }
				 else if(c == 10 || c == 32 ){
					   return a;
					 }
			 }

		return null;
	}
	

	public float nextFloat() {
		for(int i=0;i<file.length();i++){
			 c = ((CharSequence) file).charAt(i);
			 if(c>47 || c< 58 || c == 46){//실수인 경우
				 s = Character.toString((char)c); 
				 list2.add(s);
			       a += list2.get(i);
			 }
			 else if(c == 10 || c == 32 ){
				f = Float.parseFloat(a);
				return f;
					 }
			 }
		return 0;
	}

	public int nextInt() {
		for(int i=0;i<file.length();i++){

			 c = ((CharSequence) file).charAt(i);

			 if(c>47 || c< 58){//숫자인 경우
				 s = Character.toString((char)c); 
				 list3.add(s);
			       a += list3.get(i);
			 }
			 else if(c == 10 || c == 32 ){
					 b = Integer.parseInt(a);
					 }
			 }
		return 0;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}
}