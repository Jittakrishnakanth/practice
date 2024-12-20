package practice;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
public class FormattingDateandTime2 {
	  public static void main(String[] args) {  
	    LocalDateTime myDateObj = LocalDateTime.now();  
	    System.out.println("Before Formatting: " + myDateObj);  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	    
	    String formattedDate = myDateObj.format(myFormatObj);  
	    System.out.println("After Formatting: " + formattedDate);  
	  }  
	}

	// Note: This example displays the server's local time, which may differ from your local time.


