package util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import common.Base;

public class Retry extends Base implements IRetryAnalyzer {
	//Counter to keep track of retry attempts
			private int retryAttemptsCounter = 0;
			
			//The max limit to retry running of failed test cases
			//Set the value to the number of times we want to retry
			private int maxRetryLimit = 1;
	
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess()){
				if(retryAttemptsCounter < maxRetryLimit){
					driver.manage().deleteAllCookies();
					driver.get(URL);
					retryAttemptsCounter++;
					return true;
				}
			}
			return false;
	}
	}