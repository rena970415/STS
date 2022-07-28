package com.example.ex00.dependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.ex00.dependency.qualifier.Computer;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class QualifierTests {

	@Autowired
	@Qualifier("desktop")
	private Computer descktop;

	@Autowired
	@Qualifier("laptop")
	private Computer laptop;

	@Test
	public void testQualifier() {
		log.info("***********************************");
		log.info("computer : " + descktop);
		log.info("screen width : " + descktop.getScreenWidth());
		log.info("***********************************");



		log.info("***********************************");
		log.info("computer : " + laptop);
		log.info("screen width : " + laptop.getScreenWidth());
		log.info("***********************************");

	}
}
