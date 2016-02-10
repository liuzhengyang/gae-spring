package com.github.liuzhengyang.javaproxy.controller;

import com.github.liuzhengyang.javaproxy.utils.Utils;
import okhttp3.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Description:
 *
 * @author liuzhengyang
 * @version 1.0
 * @since 2016-02-10
 */
@Controller
public class FetchController {
	@RequestMapping("/fetch")
	@ResponseBody
	public String fetch(@RequestParam("url") String url) throws IOException {
		return Utils.get(url);
	}
}
