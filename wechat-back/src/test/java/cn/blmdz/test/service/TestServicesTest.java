package cn.blmdz.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.blmdz.wechat.WechatBackApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WechatBackApplication.class)
@WebAppConfiguration
@Transactional
@Rollback
@ActiveProfiles("dev")
public class TestServicesTest {

	@Test
	public void test() {
	    
	}
}
