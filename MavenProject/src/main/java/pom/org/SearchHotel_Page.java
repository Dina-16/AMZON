package pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_Page {
	
	WebDriver driver;
	public SearchHotel_Page(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement Location ;
	public WebElement getLocation() {
		return Location;
	}


	@FindBy(id="hotels")
	private WebElement Hotels ;	
	public WebElement getHotels() {
		return Hotels;
	}

	
	@FindBy(id="room_type")
	private WebElement Room_Type ;	
	public WebElement getRoom_Type() {
		return Room_Type;
	}

	@FindBy(id="room_nos")
    private WebElement Number_of_Rooms ;		
	public WebElement getNumber_of_Rooms() {
		return Number_of_Rooms;
	}

	
	@FindBy(id="datepick_in")
	private WebElement Check_In_Date ;		
	public WebElement getCheck_In_Date() {
		return Check_In_Date;
	}
	
	@FindBy(id="datepick_out")
	private WebElement Check_Out_Date ;	
	public WebElement getCheck_Out_Date() {
		return Check_Out_Date;
	}
	
	@FindBy(id="adult_room")
	private WebElement  Adults_per_Room ;	
	public WebElement getAdults_per_Room() {
		return Adults_per_Room;
	}
	
	@FindBy(id="child_room")
	private WebElement Children_per_Room;
	public WebElement getChildren_per_Room() {
		return Children_per_Room;
	}
	
		
    
    @FindBy(xpath="//input[@value='Search']")
    private WebElement search;
    public WebElement getSearch() {
		return search;
	}
    
    @FindBy(xpath="//input[@value='Reset']")
    private WebElement reset;
	public WebElement getReset() {
		return reset;
	}


	

}
