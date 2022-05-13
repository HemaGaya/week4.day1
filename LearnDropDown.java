package week4.day1;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnDropDown
{
	public static void main(String[] args)
	{
		//setup the driver and create chromedriver instance
		WebDriverManager.chromedriver().setup();
		//creating object to get functions
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//create implicit wait for window actions
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//enter username and pasword
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//enter into login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Enter into crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//enter into lead
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TeastLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Siva");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
		WebElement MarketingCampaigndropdown=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketing=new Select(MarketingCampaigndropdown);// 
		marketing.selectByVisibleText("Automobile");
		WebElement PreferredCurrency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select source=new Select(PreferredCurrency);
		source.selectByIndex(1);
		WebElement  IndustryDropown=(driver.findElement(By.id("createLeadForm_industryEnumId")));
		Select industry=new Select(IndustryDropown);
		List<WebElement> obj=industry.getOptions();
		List<String> list=new ArrayList<String>();
		for (WebElement option: obj)
		{list.add(option.getText());
		}
		System.out.println(list);
}}