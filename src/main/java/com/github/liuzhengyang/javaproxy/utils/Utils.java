package com.github.liuzhengyang.javaproxy.utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Description:
 *
 * @author liuzhengyang
 * @version 1.0
 * @since 2016-02-10
 */
public class Utils {
	private Utils() {

	}

	public static String get(String urlStr) {
		try {
			URL url = new URL(urlStr);
			InputStream inputStream = url.openStream();
			String s = IOUtils.toString(inputStream, StandardCharsets.UTF_8.displayName());
			inputStream.close();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
