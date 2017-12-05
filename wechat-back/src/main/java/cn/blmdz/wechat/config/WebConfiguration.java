package cn.blmdz.wechat.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.github.pagehelper.PageHelper;

import cn.blmdz.wechat.interceptor.ErrorInterceptor;
import cn.blmdz.wechat.interceptor.PageErrorFilter;

/**
 * 额外总配置文件
 * @author yangyz
 * @date 2016年12月2日下午5:22:26
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

	/**
	 * 分页插件
	 */
	@Bean
    public PageHelper pageHelper(DataSource dataSource) {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

	/**
	 * 调试log
	 */
	@Bean
	public PageErrorFilter filter(@Value("${other.debugger}") boolean debugger) {
		return new PageErrorFilter(debugger);
	}
	
	/**
	 * 增加处理FileNotFound
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(new ErrorInterceptor());
	}
	
}
