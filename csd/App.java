package csd;

class App {
	public static void main(String [] args)
	{
		CountStringTest.run();		
	}
}

class CountStringTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("quit".equals(s1))
				break;
			
			System.out.print("Birinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			int count = StringUtil.countString(s1, s2);
			
			System.out.printf("Birinci yazıda ikinci yazıdan %d adet var%n", count);
			
			count = StringUtil.countStringIgnoreCase(s1, s2);
			
			System.out.printf("Birinci yazıda ikinci yazıdan \"case insensitive\" olarak %d adet var%n", count);
		}
		
		System.out.println("Program sonu...");
	}
}

class StringUtil {
	public static int countString(String s1, String s2)
	{
		int cnt = 0;
		int idx = 0;
		
		while ((idx = s1.indexOf(s2, idx)) != -1) {
			++cnt;
			++idx;
		}		
			
		return cnt;
	}
	
	public static int countStringIgnoreCase(String s1, String s2)
	{
		return countString(s1.toLowerCase(), s2.toLowerCase());
	}
}



