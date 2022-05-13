package week4.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TableRowColSize
{
public static void main(String[] args) 
{	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		int tablecount = driver.findElements(By.xpath("(//table)")).size();
		System.out.println("Total table count "+tablecount);
		for(int i= 1;i<=tablecount;i++)
		{
			int table1rowcount =driver.findElements(By.xpath("(//table)["+i+"]//tr")).size();
			System.out.println(" row in table "+i+" is " +table1rowcount);
			int table1colcount =driver.findElements(By.xpath("(//table)["+i+"]//th")).size();
			System.out.println(" column in table "+i+" is - "+table1colcount);
		}	
	}
}