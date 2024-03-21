package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {
    @Override
    public void onStart(ITestContext arg) {
        System.out.println("onStart - Tum testlerden once 1 sefer cagrilir =>" + arg.getName());
    }

    @Override
    public void onFinish(ITestContext arg) {
        System.out.println("onFinish - Tum testlerden sonra 1 sefer cagrilir =>" + arg.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart - Method sayisi kadar, Her bir @Test annotation dan once bir kez calisir=>" + result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess - Pass olan method sayisi kadar, ve success edilen methodlardan sonra bir kez calisir=>" + result.getName());
        try {
            ReusableMethods.getScreenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped - Skipped edilen method sayisi kadar, ve skipped edilen methodlardan sonra bir kez calisir=>" + result.getName());
        try {
            ReusableMethods.getScreenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onTestFailure(ITestResult result) {
        // System.out.println("onTestFailed - Failed edilen method sayisi kadar, ve failed edilen methodlardan sonra bir kez calisir=>" + result.getName());
        try {
            ReusableMethods.getScreenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
