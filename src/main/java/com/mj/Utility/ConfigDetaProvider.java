package com.mj.Utility;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigDetaProvider {
	Properties pro;
	public ConfigDetaProvider() throws IOException {
		String cofigpath="E:\\New folder\\MJ.2022batch\\config.properties\\configproperties";
		FileInputStream file = new FileInputStream(cofigpath);
		//Properties pro = new Properties();
			pro = new Properties();
			pro.load(file);
		
	}
	public String getStageUrl() {
		return pro.getProperty("StageUrl");
	}
	

}
