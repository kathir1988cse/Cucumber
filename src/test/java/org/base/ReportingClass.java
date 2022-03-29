package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.tsp.ArchiveTimeStampValidationException;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	
	public static void generateJVMReport(String json) {
		
		File file = new File("E:\\Selenium\\Cucumber\\Report");
		
		Configuration configuration = new Configuration(file, "BLAZE DEMO");
		
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Sprint No", "25");
		configuration.addClassifications("Environment", "UI");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();
		

	}

}
