package com.example.LivrosApi;

import LivrosApi.LivrosApiApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = LivrosApiApplication.class)
class LivrosApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
