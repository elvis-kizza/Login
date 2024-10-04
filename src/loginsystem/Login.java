package loginsystem;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String correctusername="Elvis";
		String correctpasscode="Elvis256";
		
		Scanner input= new Scanner(System.in);
		
		for(int trials=1;trials <=3;trials++) {
			System.out.println("trial "+ trials + " enter username and passcode");
			String username=input.nextLine();
			String passcode=input.nextLine();
	if(username.equals(correctusername)&&passcode.equals(correctpasscode)) {
			
		System.out.println("Login successful");
		break;

	}else {		System.out.println("Login failed");


}
	
	
		}
	
	
	
	
}
}