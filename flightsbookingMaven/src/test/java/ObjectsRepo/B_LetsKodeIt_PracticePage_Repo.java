package ObjectsRepo;
import org.openqa.selenium.By;
public class B_LetsKodeIt_PracticePage_Repo {
	
	public static final By PracticePage = By.xpath("//div//h1[.='Practice Page']");
	public static final By RadioButtonExample = By.id("radio-btn-example");
	public static final By SelectClassExample = By.id("select-class-example");
	//Radio Buttons
	public static final By Rd_BMW = By.id("bmwradio");
	public static final By Rd_Benz = By.xpath("//input[@id='benzradio']");
	public static final By Rd_Honda = By.xpath("//input[@id='hondaradio']");
	// Check Boxes
	public static final By Chbx_BMW = By.xpath("//input[@id='bmwcheck']");
	public static final By Chbx_Benz = By.xpath("//input[@id='benzcheck']");
	public static final By Chbx_Honda = By.xpath("//input[@id='hondacheck']");
	//Combination for rado and check box
	public static final By AllRadioButton = By.xpath("//input[@type='radio']");
	// Single Select from Drop-Downs
	public static final By SelctElements= By.xpath("//select[@id='carselect']");
	// Multi Select from Drop-Downs
	public static final By MultiSelectList = By.xpath("//select[@id='multiple-select-example']");
	
	
	
	
	
	
	

	
	
	
	
	
	

}
