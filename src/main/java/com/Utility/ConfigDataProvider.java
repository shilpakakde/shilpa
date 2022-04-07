package com.Utility;

import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() throws Exception{
		String path="C:\\Users\\Acer\\eclipse-workspace\\FrameWork\\src\\main\\java\\com\\Utility\\ConfigDataProvider.java";
		FileInputStream fis=new FileInputStream(path);
		pro=new Properties();
		pro.load(fis);
	}
	public String getStageUrl() {
		return pro.getProperty(getStageUrl());
	}
	
}
