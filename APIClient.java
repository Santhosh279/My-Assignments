package homeAssdayignment.day5;

import javax.activation.MailcapCommandMap;
import javax.swing.text.Element;

import cucumber.api.cli.Main;

public class APIClient {
void sendRequest(String endpoint) {
	String n ;
	n=endpoint;
	System.out.println(n);

}

void sendRequest (String endpoint,String requestBody,Boolean requestStatus ) {
	String y;
	y=endpoint;
	String j;
	j=requestBody;
	Boolean r;	
	r=requestStatus;
		
 System.out.println(y);
 System.out.println(j);
 System.out.println(r);

}
public static void main(String[] args) {
	APIClient S1= new APIClient();
	
	S1.sendRequest("Test");
	S1.sendRequest("New", "Data", true);
	
}
}
