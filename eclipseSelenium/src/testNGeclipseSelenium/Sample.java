package testNGeclipseSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		System.out.println("hELLO...");
		
		
		WebDriver driver= new FirefoxDriver();
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\selenium\\scr23.png");
		FileUtils.copyFile(scr, dest);
		
		
	
	}

}
