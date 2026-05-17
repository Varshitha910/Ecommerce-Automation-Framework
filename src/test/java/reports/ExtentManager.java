package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {

        if (extent == null) {

            ExtentSparkReporter reporter =
                    new ExtentSparkReporter("reports/AutomationReport.html");

            reporter.config().setReportName("Automation Test Report");
            reporter.config().setDocumentTitle("Day 37 Report");

            extent = new ExtentReports();

            extent.attachReporter(reporter);

            extent.setSystemInfo("Tester", "Varshitha");
            extent.setSystemInfo("Framework", "Selenium + Cucumber + TestNG");
        }

        return extent;
    }
}