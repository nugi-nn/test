# TEST 1

// nomor 1


//nomor 2
``` Javascript
const angka1 = [0,1,2,2,1,0,0,2,0,1,1,0]

const descOrder = angka1.sort((a, b) => a > b ? 1 : -1);
console.log(descOrder); 
```
// nomor 3
``` Javascript
var foo = new Array(6);
for(var i = 0; i < foo.length; i++){
  console.log(('Item: ' + (i + 1) + ' , ' + foo.length)); 
}
```

//nomor 4



# TEST 2

##TestCase 1
``` groovy
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

Mobile.tap(findTestObject('step1/android.widget.Button0 - Lewati'), 0)

Mobile.tap(findTestObject('step1/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('step1/android.widget.EditText0 - Cari obat penyakit atau tips kesehatan...'), 0)

Mobile.setText(findTestObject('step1/android.widget.EditText0 - Cari obat penyakit atau tips kesehatan...'), 'cara terhindar dari corona', 
    0)

Mobile.delay(3)

def Appium_Button_Enter(){

  AppiumDriver driver = MobileDriverFactory.getDriver()
  AndroidDriver androidDr = (AndroidDriver) driver
  Map<String,String> map = new HashMap()
  map.put("action","search")
  androidDr.executeScript("mobile:performEditorAction", map);
 }

Mobile.closeApplication()


```

##TestCase 2
``` groovy
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
```

## TestCase 3
``` groovy
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

Mobile.tap(findTestObject('step4/android.widget.Button0 - Lewati'), 0)

Mobile.tap(findTestObject('step4/android.widget.RelativeLayout0'), 0)

Mobile.tap(findTestObject('step4/android.widget.RelativeLayout0 (1)'), 0)

Mobile.tap(findTestObject('step4/android.widget.LinearLayout0'), 0)

Mobile.tap(findTestObject('step4/android.widget.Button0 - Masuk KlikDokter'), 0)

Mobile.setText(findTestObject('step4/android.widget.EditText0 -'), 'noviantonugroho4@gmail.com', 0)

Mobile.tap(findTestObject('step4/android.widget.Button0 - Lanjut'), 0)

Mobile.closeApplication()



```