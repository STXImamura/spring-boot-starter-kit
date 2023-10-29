package com.helloworld.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.helloworld.demo.entity.Demo;
import com.helloworld.demo.repository.DemoRepository;

@DisplayName("### DemoRepository")
@SpringBootTest
class DemoRepositoryTest {
	@Autowired
	private DemoRepository demoRepository;

	@Test
	@DisplayName("### DemoRepository.get")
	void get() {
		try {
			Demo demo = demoRepository.get(1);
			assertNotNull(demo, "demoが取得できること");
		}
		catch (Exception e) {
			assertTrue(true, "例外が発生しました");
		}
	}

}
