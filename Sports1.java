package day3;


public class Sports{
	public void acheiver(String  name,int medalCount) {
		System.out.println(name+" "+medalCount);		
	}
	public void acheiver(String country ,String sportName, int rank) {
		System.out.println(country+" "+sportName+" "+rank);		
	}
	public void acheiver(float weight, int height, long contactNo) {
		System.out.println(weight+" "+height+" "+contactNo);		
	}
	public void acheiver(String tournamentName, long prizeMoney) {
		System.out.println(tournamentName+" "+prizeMoney);		
	}
 public static void main(String[] args) {
	Sports call=new Sports();
	call.acheiver("Subaru", 1);
	call.acheiver("india", "criket",3 );
	call.acheiver(53.0F, 5, 8124878773L);
	call.acheiver("indianSemiFinal", 1000);
}

}
