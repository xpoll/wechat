package cn.blmdz.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.blmdz.wechat.WechatBackApplication;
import cn.blmdz.wechat.dao.SwitchDao;
import cn.blmdz.wechat.model.XpollSwitch;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WechatBackApplication.class)
@WebAppConfiguration
@Transactional
@Rollback
@ActiveProfiles("local")
public class TestServicesTest {

    @Autowired
    SwitchDao switchDao;
	@Test
	public void test() {

        PageHelper.startPage(0, 100, null);
        Page<XpollSwitch> page = switchDao.page();
        
        for (XpollSwitch xpollSwitch : page) {
            System.out.println(xpollSwitch);
        }
	}
}
