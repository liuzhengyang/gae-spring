package com.github.liuzhengyang.javaproxy.controller;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

/**
 * Description:
 *
 * @author liuzhengyang
 * @version 1.0
 * @since 2016-02-10
 */
@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping("/")
	public String hello(Model model) {
		List<String> images = Lists.newArrayList(ProjectConfig.imageNames);
		Collections.shuffle(images);
		model.addAttribute("images", images);
		return "index";
	}
}
