package week1day5class1;

public class Palindrom {
	public static void main(String[] args) {
		String name="madam";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			//System.out.println(name.charAt(i));
	}
	if(name.equals(rev))
		//if(name.equalsIgnoreCase(rev))
	
			System.out.println("it is a palindrom");
		
		else
			System.out.println("it is not palindrom");
		}
}
