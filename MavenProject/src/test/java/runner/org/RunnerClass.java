package runner.org;

import FrameWork.MavenProject.BaseClass;
import pom.org.BookHotel_Page;
import pom.org.BookedItinerary_Page;
import pom.org.Login_Page;
import pom.org.Logout_Page;
import pom.org.SearchHotel_Page;
import pom.org.SelectHotel_Page;
import pom.org.UserRegister_Page;

public class RunnerClass extends BaseClass {

	public static void main(String[] args) {
		
		browserlaunch("Chrome");
		url("https://adactinhotelapp.com/");
		
		//login scenario
		Login_Page lp = new Login_Page(driver);  //Parameterized constructor
		sendkeys(lp.getUser(), "Selenium143");
		sendkeys(lp.getPass(), "password@123");
		click(lp.getLogin());
		implicityWait(3000);
		
//		//new register scenario
//		UserRegister_Page up = new UserRegister_Page(driver);
//		click(up.getNewUserReg());
//		sendkeys(up.getUser(), "Dina");
//		sendkeys(up.getPass(), "Dina@1605");
//		sendkeys(up.getConfirmPass(), "Dina@1605");
//		sendkeys(up.getFullName(), "DinaDinesh");
//		sendkeys(up.getEmailAddr(), "Dina5@gmail.com");
//		sendkeys(up.getCaptchaText(), "");
//		click(up.getTermCond());
//		click(up.getReg());
//		implicityWait(3000);
		
		  //search hotl scenario
		SearchHotel_Page sp = new SearchHotel_Page(driver);
		SelectByIndex(sp.getLocation(), 3);
		SelectByValue(sp.getHotels(), "Hotel Sunshine");	
		SelectByVisibleText(sp.getRoom_Type(), "Double");
		SelectByIndex(sp.getNumber_of_Rooms(), 3);
		clear(sp.getCheck_In_Date());
		sendkeys(sp.getCheck_In_Date(), "25/11/2023");
		clear(sp.getCheck_Out_Date());
		sendkeys(sp.getCheck_Out_Date(), "28/11/2023");
		SelectByIndex(sp.getAdults_per_Room(), 3);
		SelectByIndex(sp.getChildren_per_Room(), 2);
		click(sp.getSearch());
		implicityWait(3000);
		 
		//select Hotel scenario
		
		SelectHotel_Page shp = new SelectHotel_Page(driver);
		click(shp.getHotel_select());
		click(shp.getContinue_());
		implicityWait(3000);
		
		//hotl booked scenario
		
		BookHotel_Page  bp =new BookHotel_Page(driver);
        sendkeys(bp.getFirstName(), "Dina");
        sendkeys(bp.getLastName(), "M");
        sendkeys(bp.getBillingAddr(), "Chennai");
        sendkeys(bp.getCardNo(), "1234567890123456");
        SelectByVisibleText(bp.getCardType(), "VISA");
        SelectByIndex(bp.getExpiryMonth(), 4);
        SelectByVisibleText(bp.getExpiryYear(), "2024");
        sendkeys(bp.getCvvNum(), "555");
        click(bp.getBookNow());
        implicityWait(3000);
        
        //booked and cancel scenario
        BookedItinerary_Page bip = new BookedItinerary_Page(driver);
        click(bip.getMyItinerary());
        click(bip.getClkCheckBox());
        click(bip.getCancelSelected());
        implicityWait(3000);
        confirmationAlert("accept");
        implicityWait(3000);
        
     //Logout scenario	   
        Logout_Page lop = new Logout_Page(driver);
        click(lop.getLogout());
        implicityWait(3000);
	}

}
