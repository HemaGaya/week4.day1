package week4.day1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LibraryPrintValues
{
public static void main(String[] args) throws InterruptedException
{	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		List<WebElement> rowelement =driver.findElements(By.xpath("(//table)[1]//tr"));
		int rowcount =rowelement.size();
		System.out.println(rowcount);
		System.out.println(rowelement.get(0).getText());
		System.out.println(rowelement.get(1).getText());
		System.out.println(rowelement.get(2).getText());
}}