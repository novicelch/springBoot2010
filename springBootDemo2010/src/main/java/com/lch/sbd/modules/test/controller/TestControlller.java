package com.lch.sbd.modules.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lch.sbd.modules.test.vo.ConfigBean;

@RestController
@RequestMapping("/api/test")
public class TestControlller {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(TestControlller.class);
	
	@Value("${server.port}")
	private int port;
	@Value("${com.lch.name}")
	private String name;
	@Value("${com.lch.age}")
	private int age;
	@Value("${com.lch.desc}")
	private String desc;
	@Value("${com.lch.random}")
	private String random;
	
	@Autowired
	private  ConfigBean configBean;
	
	/**
	 * http://127.0.0.1/api/test/log
	 *
	 */
	@RequestMapping("/log")
	@ResponseBody
	public String logTest(){
		LOGGER.trace("This is TRACE log.");
		LOGGER.debug("This is DEBUG log.");
		LOGGER.info("This is INFO log.");
		LOGGER.warn("This is WARN log.");
		LOGGER.error("This is ERROR log.222222");
		return "this is log test";
		
	}
	/**
	 * http://127.0.0.1/api/test/config
	 */
	@RequestMapping("/config")
	@ResponseBody
	public String configTest(){
		StringBuffer sb = new StringBuffer();
		sb.append(port).append("-----")
		.append(name).append("----")
		.append(age).append("----")
		.append(desc).append("----")
		.append(random).append("----").append("<br/>");
		sb.append(configBean.getName()).append("------")
		.append(configBean.getAge()).append("------")
		.append(configBean.getDesc()).append("------")
		.append(configBean.getRandom()).append("------");
		return sb.toString();
	}
	
	/**
	 * 
	 * http://127.0.0.1/api/test/appDesc
	 */
	@RequestMapping("/appDesc")
	@ResponseBody
	public String getDsc(){
		return "Hello word,this is my first Spring boot demo.";
	}
}
