package com.cal.integration.tests;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cal.Calculator;

public class CalculatorIT {

//	Just dump the result of each operation into a file 
//	We will cross check if the file is getting created (Assertion)
//	Cross Check if the right content is written in the file (Assertion)
	Calculator cal;
	File outputFile;
	
	@BeforeClass(description = "Setup the Cal object and the artifact folder ")
	public void setup() {
		cal = new Calculator();
		File outputDir = new File("target/integrationTest");
		if (!outputDir.exists()) {
			outputDir.mkdir();
		}
		outputFile = new File(outputDir, "intergrationResult.txt");

	}

	@Test(description = "Verify outfile is created and the content matches as expected",groups= {"integration"})
	public void calculatorIntergrationTest() throws IOException {

//		File outputFile = new File("intergrationResult.txt");

		double addResult = cal.add(20, 20);
		double subResult = cal.subtract(20, 10);
		double mulResult = cal.multiple(20, 20);
		double divResult = cal.divide(20, 5);

		List<String> lines = Arrays.asList(addResult + "", subResult + "", mulResult + "", divResult + "");
		
		FileUtils.writeLines(outputFile, lines);
		Assert.assertTrue(outputFile.exists(), "integrationResult.txt should be present");

		List<String> actualLines = FileUtils.readLines(outputFile, StandardCharsets.UTF_8);

		Assert.assertEquals(actualLines, lines, " Mismatch found in the file"); // comparing the 2 lists AssertEquals

	}

}
