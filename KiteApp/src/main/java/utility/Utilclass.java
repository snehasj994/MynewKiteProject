package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import utility.*;

public class Utilclass {

	
	public void takeScreenshot(WebDriver driver,int tcId)throws IOException{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   Date d=new Date();
			String date=d.toString();
			String str=date.replace(":", "_");
			
				File f=new File(Configuration.screenshotpath+str+".jpg");
				FileHandler.copy(src, f);
			
			
	}
	
	/*public static void SaveScreenShot(WebDriver driver,int TestId) throws IOException{
		   String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		   File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File Dest = new File ("C:\\selenium image\\failed"+TestId+"-"+timestamp+ ".jpg");
			FileHandler.copy(src, Dest);
	
}
public static String getDataFromDatasheet(int row,int col) throws IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\VRG COMPUTER\\Desktop\\Book1.xlsx");
		String data;
	  //  String number = Double.toString();
			Sheet value= WorkbookFactory.create(file).getSheet("velocity");
	         try {
	        	 data=value.getRow(row).getCell(col).getStringCellValue();
	         }
	         catch(IllegalStateException e) {
	        	 double d=value.getRow(row).getCell(col).getNumericCe*/
}