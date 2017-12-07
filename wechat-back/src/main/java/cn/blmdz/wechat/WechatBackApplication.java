package cn.blmdz.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.blmdz.wechat.config.GlobalExceptionHandler;
import cn.blmdz.wechat.config.Swagger2Configuration;
import cn.blmdz.wechat.config.WebConfiguration;
import cn.blmdz.wechat.properties.OtherProperties;

@SpringBootApplication
@Import({
	GlobalExceptionHandler.class,
	WebConfiguration.class,
	Swagger2Configuration.class
	})
@EnableConfigurationProperties(OtherProperties.class)
public class WechatBackApplication extends WebMvcConfigurerAdapter {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }
    
	public static void main(String[] args) {
	    SpringApplication.run(WechatBackApplication.class, args);
	}
}
