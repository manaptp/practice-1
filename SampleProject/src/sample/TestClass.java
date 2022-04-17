package sample;

public class TestClass {

	public static void main(String[] args) {
//		System.out.println(args[1]);
		int count = 0;
		String s = "aabc";
		int l = s.length();
		System.out.println(l);
		char[] c = s.toCharArray();
		int cl = c.length;
		System.out.println(c[0]);
		if (c[0]=='a') {
			count++;
			System.out.println(count);
		}
		else if(c[1] == 'a') {
			count++;
			System.out.println(count);
		}
		else if(c[2] == 'a') {
			count++;
			System.out.println(count);
		}
		else if (c[3] == 'a') {
			count++;
			System.out.println(count);
		}
		else {
			System.out.println("Given string doesn't have char a");
		}
	}
	

}
