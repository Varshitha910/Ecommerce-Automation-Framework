package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class ScreenshotUtils extends BaseTest {

    public static String captureScreenshot(String fileName) {

        File src =
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String path = "screenshots/" + fileName + ".png";

        try {

            FileUtils.copyFile(src, new File(path));

        } catch (IOException e) {

            e.printStackTrace();
        }

        return path;
    }
}