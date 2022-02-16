package day3;

public class ReverseWord {

	public static void main(String[] args) {
		String input = "i am software Tester";
		String[] word = input.split(" ");
	//System.out.println(word[2]);
		for (int i = 0; i < word.length; i++) {
			if(i%2==1) {
				for (int j = word[i].length()-1; j >=0; j--) {
					System.out.print(word[i].charAt(j));
				}
			System.out.print(" ");
		}
		else
			System.out.print(word[i]+" ");
	
		
	}

}
}
