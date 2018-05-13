package ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "C://Users//Anil//Desktop//report-demo.html";
		extent = new ExtentReports(Path, false);
		extent
	     .addSystemInfo("Selenium Version", "3.11")
	     .addSystemInfo("Platform", "PC");

		return extent;
	}
}