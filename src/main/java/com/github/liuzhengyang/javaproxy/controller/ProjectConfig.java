package com.github.liuzhengyang.javaproxy.controller;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 *
 * @author liuzhengyang
 * @version 1.0
 * @since 2016-02-10
 */
public class ProjectConfig implements ServletContextListener{
	public static List<String> imageNames;

	@Override
	public void contextInitialized(ServletContextEvent servletContext) {
		try {
			String dirString = servletContext.getServletContext().getResource("/images").getFile();
			File dir = new File(dirString);
			String[] list = dir.list();
			imageNames = Arrays.asList(list);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
