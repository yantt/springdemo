package com.zwt.xsy.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class testDemo {

	@Value("#configProperties['jdbc.url']")
	private  String url;
	
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public static void main(String[] args) {
		//ApplicationContext app = new FileSystemXmlApplicationContext("classpath:\\config\\spring\\application.xml");
        //System.out.println(app.getId());
		//StuBean sb = (StuBean)app.getBean("stuB");
		testDemo tm = new testDemo();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//System.out.println(sdf.format(new Date()));
		System.out.println(tm.getUrl());
		
		
		
	}

}
