import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

class TestBrower {

	@Test
	void testCodingMidCareer() {
	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.coding-midcareer.com/");
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement waitWeb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("theme-btn")));
        waitWeb.click();	
        
        Select preName = new Select(driver.findElement(By.id("pre_name_th")));
        //preName.selectByVisibleText("นาย");
	preName.selectByIndex(1);
        
	WebElement name_input = driver.findElement(By.name("name_th"));
	WebElement last_name_input = driver.findElement(By.name("lastname_th"));
	WebElement name_eng_input = driver.findElement(By.name("name_en"));
	WebElement last_name_eng_input = driver.findElement(By.name("lastname_en"));
	WebElement id_card_input = driver.findElement(By.name("id_card"));
	//WebElement date_input = driver.findElement(By.name("birthday"));
	WebElement phone_input = driver.findElement(By.name("phone"));
	WebElement email_input = driver.findElement(By.name("email"));
		
	name_input.sendKeys("สมชาย");
	last_name_input.sendKeys("ใจดี");
	name_eng_input.sendKeys("Somchai");
	last_name_eng_input.sendKeys("Jaidee");
	id_card_input.sendKeys("0000000000000");
	//date_input.sendKeys("28/08/2546");
	phone_input.sendKeys("0000000000");
	email_input.sendKeys("example@gmail.com");
		
        WebElement birthdayInput = driver.findElement(By.name("birthday"));
        birthdayInput.sendKeys("28/08/2546"); // แทน "วว/ดด/ปปปป" ด้วยวันที่ที่ต้องการ

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("calAge(arguments[0]);", birthdayInput);

        // คำนวณอายุ
        WebElement ageInput = driver.findElement(By.name("age"));
        String ageText = ageInput.getAttribute("value");
        int age = Integer.parseInt(ageText);

        System.out.println("AGE: " + age + " YEAR");
        driver.close();
    	}

}
