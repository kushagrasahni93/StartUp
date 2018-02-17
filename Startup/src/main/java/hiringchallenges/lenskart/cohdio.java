package hiringchallenges.lenskart;

public class cohdio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "aba";
s = s.replace(""+s.charAt(0), "");
System.out.println("s|"+s);
s = s.replace(""+s.charAt(0), "");
System.out.println("s|"+s);
if(s.isEmpty()) {
	System.out.println("S is empty");
} else {
	System.out.println("S is not empty");
}
	}

}
