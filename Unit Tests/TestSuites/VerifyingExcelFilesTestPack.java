/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import KeywordDrivenTestFramework.Entities.Enums;
import static KeywordDrivenTestFramework.Entities.Enums.Environment.UAT;
import KeywordDrivenTestFramework.Testing.TestMarshall;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import static TestSuites.AddNewTemplateTestPack.instance;
import java.io.FileNotFoundException;
import org.junit.Test;

/**
 *
 * @author ZiyandaP
 */
public class VerifyingExcelFilesTestPack {
    
    static TestMarshall instance;
    
    public VerifyingExcelFilesTestPack()
    {
        ApplicationConfig appConfig = new ApplicationConfig();
        
        TestMarshall.currentEnvironment = Enums.Environment.UAT;  
    }
     
    @Test
    public void RunMixTelematicsAddNewTemplateTestPackIE() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\AddNewTemplateTestPack.xls", Enums.BrowserType.IE);
        instance.runKeywordDrivenTests();
    }
 
    @Test
    public void RunMixTelematicsAddNewTemplateTestPackChrome() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\VerifyingDownloadedExcelFilesTestPack.xlsx", Enums.BrowserType.Chrome);
        instance.runKeywordDrivenTests();
    }
    
    @Test
    public void RunMixTelematicsAddNewTemplateTestPackFireFox() throws FileNotFoundException
    {
        System.out.println("Mix Telematics Test Pack");   
        instance = new TestMarshall("TestPacks\\AddNewTemplateTestPack.xls", Enums.BrowserType.FireFox);
        instance.runKeywordDrivenTests();
    }
    
}