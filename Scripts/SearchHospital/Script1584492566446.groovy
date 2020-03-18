import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.KeyEvent
import io.appium.java_client.android.nativekey.AndroidKey

Mobile.startApplication('C:\\Users\\Nugie\\Downloads\\5_6291790354614059221.apk', true)

Mobile.tap(findTestObject('step2/android.widget.Button0 - Lewati'), 0)

Mobile.tap(findTestObject('step2/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('step2/android.widget.ImageView0'), 0)

Mobile.setText(findTestObject('step2/android.widget.EditText0'), 'siloam', 0)

Mobile.delay(3)

def Appium_Button_Enter(){

  AppiumDriver driver = MobileDriverFactory.getDriver()
  AndroidDriver androidDr = (AndroidDriver) driver
  Map<String,String> map = new HashMap()
  map.put("action","search")
  androidDr.executeScript("mobile:performEditorAction", map);
 }
 
Mobile.closeApplication()