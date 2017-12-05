package cn.blmdz.wechat.service;

import com.github.pagehelper.PageHelper;

import cn.blmdz.wechat.base.BasePage;
import cn.blmdz.wechat.dao.BaseDao;
import cn.blmdz.wechat.exception.WebJspException;
import lombok.extern.slf4j.Slf4j;

/**
 * BaseService.java
 * @author lm
 * @date 2016年12月8日 下午9:38:10
 * @param <T>
 */
@Slf4j
public abstract class BaseService<T> {
	
	public abstract BaseDao<T> getBaseDao();
	
	
	/**
	 * 根据ID查找
	 */
	public T findById(Long id) {
		return this.getBaseDao().findById(id);
	}
	
	/**
	 * 分页
	 */
	public BasePage<Object, T> page(BasePage<Object, T> base) {
		
		PageHelper.startPage(base.getNum(), base.getSize(), base.getOrder());
		base.setPage(this.getBaseDao().page());
		
		return base;
	}

	/**
	 * 创建
	 */
	public T create(T base) {
		try {
			this.getBaseDao().create(base);
			return base;
			
		} catch (Exception e) {
			log.error("{} create faild.", base.getClass().getSimpleName());//TODO
			e.printStackTrace();
			throw new WebJspException();
		}
	}

	/**
	 * 更新
	 */
	public void update(T base) {
		try {
			if (this.getBaseDao().update(base) == 0)
				throw new WebJspException();//无数据
		} catch (WebJspException e) {
			log.error("{} update faild.", base.getClass().getSimpleName());//TODO
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			log.error("{} update faild.", base.getClass().getSimpleName());//TODO
			e.printStackTrace();
			throw new WebJspException();
		}
	}
}
