package com.DataArtAutomation.MyCV;


import com.DataArtAutomation.MyCV.MyCv;
import org.testng.annotations.*;
import static org.assertj.core.api.Assertions.*;

public class CVTest {
	
   private MyCv cv;
	
     @BeforeClass
     public void setUpCv() {
         cv = new MyCv("Debasmita Mishra", 32, "Whitefield,Bengaluru", "debmishra23@gmail.com","Automation Tools: Selenium,| Languages: Java, SQL | Frameworks: TestNG | Version Control: Git | Bug Tracking: Jira","8989756432");
     }

     @Test
     public void printCv() {
    	 System.out.println("\n=================================================");
         System.out.println("                  MY CV                          ");
         System.out.println("=================================================");
         System.out.println("Full Name       : " + cv.getName());
         System.out.println("Email           : " + cv.getEmail());
         System.out.println("Location        : " + cv.getAddress());
        
         System.out.println("Technical Skills: " + cv.getTechnicalSkills());
         System.out.println("Phone Number    : " + cv.getPhoneNumber());
         
         System.out.println("=================================================");
     }
     
     @AfterClass
     
     public void validateCvDetails() {
    	 assertThat(cv).isNotNull();
    	 assertThat(cv.getName()).isNotBlank();
    	 assertThat(cv.getAge()).isGreaterThan(0);
    	 assertThat(cv.getAddress()).isNotBlank();
    	 assertThat(cv.getEmail()).contains("@");
    	 assertThat(cv.getTechnicalSkills()).contains("Selenium");
    	 
    	 System.out.println("CV Details Validated Successfully");
    	 
     }
     
     
}



