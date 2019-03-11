import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "\\Courses\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileuploadfield = driver.findElement(By.id("file-upload-field"));
        fileuploadfield.sendKeys("file-to-upload.png");

        driver.quit();
    }
}
