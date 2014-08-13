/*
 This is the Geb configuration file.
  See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions


println "Inside GebConfig.groovy file"

//set up for Firefox

driver = { new FirefoxDriver() }



//set up for IE
//System.setProperty("webdriver.ie.driver", "d:\\venkat\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//capabilities.setCapability("ignoreZoomSetting", true);
//capabilities.setCapability("ignoreProtectedModeSettings" , true);
//capabilities.setCapability("initialBrowserUrl","https://staging.secretescapes.com");

//driver = {new InternetExplorerDriver(capabilities)}

//set up for Chrome
//System.setProperty("webdriver.chrome.driver", "D:\\venkat\\chromedriver_test\\chrome-win32\\chromedriver.exe");
//ChromeOptions options = new ChromeOptions();
//options.setBinary(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));
//driver = { new ChromeDriver() }





//reports directory
//spock tests will take screenshots and store in this folder

reportsDir = 'd:\\se_automation'
