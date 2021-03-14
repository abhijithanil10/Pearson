package com.pearson.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {



	public String getPropertyKeyValue(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./Testdata/pearson.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
}
