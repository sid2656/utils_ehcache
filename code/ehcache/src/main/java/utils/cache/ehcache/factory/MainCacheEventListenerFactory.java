/**
 * Project Name:main
 * File Name:MainCacheEventListenerFactory.java
 * Package Name:com.hdsx.taxi.driver.cq.cache
 * date: 2014年4月9日 上午11:27:06 
 * Copyright (c) 2014, sid Jenkins All Rights Reserved.
 * 
 *
*/

package utils.cache.ehcache.factory;

import java.util.Properties;

import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheEventListenerFactory;
import utils.cache.ehcache.listener.MsgCacheEventListener;
import utils.cache.ehcache.main.MsgCacheConstants;
import utils.utils.LogUtil;

/**
 * 
 * ClassName: MainCacheEventListenerFactory 
 * date: 2014年4月9日 上午11:27:06 
 *
 * @author sid
 */
public class MainCacheEventListenerFactory extends CacheEventListenerFactory {

	@Override
	public CacheEventListener createCacheEventListener(Properties properties) {
		
		CacheEventListener listener = null;
		
		String cacheName = properties.getProperty("cacheName");
		switch (cacheName) {
		case MsgCacheConstants.CACHE_MSG:
			listener = MsgCacheEventListener.getSingletonInstance();
			break;

		default:
			if (LogUtil.getInstance().getLogger(MainCacheEventListenerFactory.class).isInfoEnabled()) {
				LogUtil.getInstance().getLogger(MainCacheEventListenerFactory.class).info("createCacheEventListener(Properties) - cacheFactory can not create cacheListener"); //$NON-NLS-1$
			}
			break;
		}
		return listener;
	}

}

