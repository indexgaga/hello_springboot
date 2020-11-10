package com.didispace;

import com.didispace.service.BlogProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.catalina.mapper.Mapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	private static final Log log = LogFactory.getLog(ApplicationTests.class);

	@Autowired
	private BlogProperties blogProperties;


	@Test
	public void test1() throws Exception {
		Assert.assertEquals("程序猿DD", blogProperties.getName());
		Assert.assertEquals("Spring Boot教程", blogProperties.getTitle());
		Assert.assertEquals("程序猿DD正在努力写《Spring Boot教程》", blogProperties.getDesc());

		log.info("随机数测试输出：");
		log.info("随机字符串 : " + blogProperties.getValue());
		log.info("随机int : " + blogProperties.getNumber());
		log.info("随机long : " + blogProperties.getBignumber());
		log.info("随机10以下 : " + blogProperties.getTest1());
		log.info("随机10-20 : " + blogProperties.getTest2());

	}

	@Test
	public void test2() throws IOException {
		String str = "{\n" +
				"\"age\": 100,\n" +
				"\"birthday\": \"2020-10-29 12:16:36\",\n" +
				"\"name\": \"小明\"\n" +
				"}";
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(str);
		System.out.println(jsonNode+"***************");

		JsonNode jsonNode1 = jsonNode.get("name");
		System.out.println(jsonNode1);
	}


	@Test
	public void test3(){
		ObjectMapper mapper = new ObjectMapper();
		ArrayNode arrayNode = mapper.createArrayNode();  //创建数组节点
		ObjectNode rootNode = mapper.createObjectNode();  //创建根节点
		arrayNode.add(1);
		arrayNode.add(2);
		arrayNode.add(1L);
		rootNode.set("arrays",arrayNode);
		rootNode.put("name","小明");
		System.out.println(rootNode);
	}
}
