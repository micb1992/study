package com.test.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.junit.Test;



public class OperateConfig {
	//读取properties配置文件
	@Test
	public String readProperties(String key) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream(
				"src/com/test/config/sys-config.properties");
		properties.load(inputStream);
		Iterator<String> iterator = properties.stringPropertyNames().iterator();
		while (iterator.hasNext()) {
			key = iterator.next();
			System.out.println(key + ":" + properties.getProperty(key));
		}
		inputStream.close();
		return properties.getProperty(key);
	}
//写入properties配置文件
	@Test
	public void writeProperties(String key,String value) throws Exception{
		Properties properties = new Properties();
		FileOutputStream outputStream = new FileOutputStream(new File("src/com/test/config/sys-config.properties"), true);
		properties.setProperty(key, value);
		properties.store(outputStream, "sys-config");
		outputStream.close();
	}
}
