/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.ConfigAdmin;

import KeywordDrivenTestFramework.Core.BaseClass;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
/**
 *
 * @author MzuvukileN
 */
public class NavigateToLibraries extends BaseClass{
    
    String error;
    int counter = 1;
    boolean isNegative;
    TestEntity testData;
    
    public NavigateToLibraries(TestEntity testData){
        this.testData = testData;
    }
    
    public TestResult executeTest() throws InterruptedException{
        this.setStartTime();
        
        if(!clickManage()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on manage", true);
            counter++;
            narrator.failedMessage("Failed to click on manage - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on manage", this.getTotalExecutionTime());
        }
        
        if(!clickLibraries()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on libraries", true);
            counter++;
            narrator.failedMessage("Failed to click on libraries - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on libraries", this.getTotalExecutionTime());
        }
        
        if(!clickEventLibrary()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on event library", true);
            counter++;
            narrator.failedMessage("Failed to click on event libraries - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on event library", this.getTotalExecutionTime());
        }
        
        if(!clickFirmLibrary()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on firmware library", true);
            counter++;
            narrator.failedMessage("Failed to click on firmware library - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on firmware library", this.getTotalExecutionTime());
        }
        
        if(!clickLocationLibrary()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on location library", true);
            counter++;
            narrator.failedMessage("Failed to click on location ibrary - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on location library", this.getTotalExecutionTime());
        }
        
        if(!clickMobDevLibrary()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on mobile device library", true);
            counter++;
            narrator.failedMessage("Failed to click on mobile device library - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on mobile device library", this.getTotalExecutionTime());
        }
        
        if(!clickParaLibrary()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on parameter library", true);
            counter++;
            narrator.failedMessage("Failed to click on parameter library - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on parameter library", this.getTotalExecutionTime());
        }
        
        if(!clickPeriLibrary()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on peripheral library", true);
            counter++;
            narrator.failedMessage("Failed to click on peripheral library - "+error);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on peripheral library", this.getTotalExecutionTime());
        }
        return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully navigated to libraries.", this.getTotalExecutionTime());
    }
    
    public boolean clickManage(){
        if(!SeleniumDriverInstance.CheckIfElementDisplayedByXpath("(//A[@href='#'])[2]")){
            error = "We could not locate Manage";
            return false;
        }
        
        SeleniumDriverInstance.clickElementbyXpath("(//A[@href='#'])[2]");
        SeleniumDriverInstance.takeScreenShot(counter + " Successfully found manage.", false);
        counter++;
        return true;
    }
    
    public boolean clickLibraries(){
        if(!SeleniumDriverInstance.waitForElementByXpath("//A[@ng-href='#/config-admin/libraries'][text()='Libraries']")){
            error = "Libraries not visible.";
            return false;
        }
        
        SeleniumDriverInstance.clickElementbyXpath("//A[@ng-href='#/config-admin/libraries'][text()='Libraries']");
        SeleniumDriverInstance.takeScreenShot(counter + " Successfully clicked on Libraries.", false);
        counter++;
        return true;
    }
    
    public boolean clickEventLibrary(){
        if(SeleniumDriverInstance.waitForElementByXpath("//SPAN[@ng-hide='column.headingClass || !column.title'][text()='Event description']")){
            SeleniumDriverInstance.takeScreenShot(counter + " Successflly clicked event library.", false);
            counter++;
            return true;
        }
        error = "Failed to click on Event library";
        return false;
    }
    
    public boolean clickFirmLibrary(){
        if(!SeleniumDriverInstance.CheckIfElementIsSelected("//a[text() = \"Firmware library\"]")){
            SeleniumDriverInstance.clickElementByXpath("//a[text() = \"Firmware library\"]");
        }
        
        if(SeleniumDriverInstance.waitForElementByXpath("//SPAN[@ng-hide='column.headingClass || !column.title'][text()='Description']")){
            SeleniumDriverInstance.takeScreenShot(counter + " Successflly clicked firmware library.", false);
            counter++;
            return true;
        }
        error = "Failed to click on Firmware library";
        return false;
    }
    
    public boolean clickLocationLibrary(){
        if(!SeleniumDriverInstance.CheckIfElementIsSelected("//a[text() = \"Location library\"]")){
            SeleniumDriverInstance.clickElementByXpath("//a[text() = \"Location library\"]");
        }
        
        if(SeleniumDriverInstance.waitForElementByXpath("//SPAN[@ng-hide='column.headingClass || !column.title'][text()='Name']")){
            SeleniumDriverInstance.takeScreenShot(counter + " Successfuly clicked on location librayr", false);
            counter++;
            return true;
        }
        error = "Failed to click on Location library";
        return false;
    }
    
    public boolean clickMobDevLibrary(){
        if(!SeleniumDriverInstance.CheckIfElementIsSelected("//a[text() = \"Mobile device library\"]")){
            SeleniumDriverInstance.clickElementByXpath("//a[text() = \"Mobile device library\"]");
        }
        
        if(SeleniumDriverInstance.waitForElementByXpath("//SPAN[@ng-hide='column.headingClass || !column.title'][text()='Mobile device']")){
            SeleniumDriverInstance.takeScreenShot(counter + " Successfuly clicked on mobile device library", false);
            counter++;
            return true;
        }
        error = "Failed to click on Mobile device library";
        return false;
    }
    
    public boolean clickParaLibrary(){
        if(!SeleniumDriverInstance.CheckIfElementIsSelected("//a[text() = \"Parameter library\"]")){
            SeleniumDriverInstance.clickElementByXpath("//a[text() = \"Parameter library\"]");
        }
        
        if(SeleniumDriverInstance.waitForElementByXpath("//SPAN[@ng-hide='column.headingClass || !column.title'][text()='Mobile device']")){
           SeleniumDriverInstance.takeScreenShot(counter + " Successfuly clicked on parameter library", false);
           counter++;
           return true; 
        }
        error = "Failed to click on Parameter library";
        return false;
    }
    
    public boolean clickPeriLibrary(){
        if(!SeleniumDriverInstance.CheckIfElementIsSelected("//a[text() = \"Peripheral library\"]")){
            SeleniumDriverInstance.clickElementByXpath("//a[text() = \"Peripheral library\"]");
        }
        
        if(SeleniumDriverInstance.waitForElementByXpath("//SPAN[@ng-hide='column.headingClass || !column.title'][text()='Peripheral']")){
            SeleniumDriverInstance.takeScreenShot(counter + " Successfuly clicked on peripheral library", false);
            counter++;
            return true;
        }
        error = "Failed to click on Peripheral library";
        return false;
    }
}