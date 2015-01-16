/**
 * Project Name:main
 * File Name:DecoratedCacheFactory.java
 * Package Name:com.hdsx.taxi.driver.cq.cache
 * Date:2014年5月21日下午1:21:02
 * Copyright (c) 2014, sid Jenkins All Rights Reserved.
 * 
 *
*/

package utils.cache.ehcache.factory;

import java.util.Properties;

import net.sf.ehcache.Ehcache;
import net.sf.ehcache.constructs.CacheDecoratorFactory;

/**
 * ClassName:DecoratedCacheFactory
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2014年5月21日 下午1:21:02 
 * @author   sid
 * @see 	 
 */
public class DecoratedCacheFactory extends CacheDecoratorFactory {

	@Override
	public Ehcache createDecoratedEhcache(Ehcache cache, Properties properties) {
//		String cacheName = properties.getProperty("cacheName");
//		switch (cacheName) {
//		case MsgCacheConstants.CACHE_MSG:
//			break;
//
//		default:
//			break;
//		}
		return cache;
	}

	@Override
	public Ehcache createDefaultDecoratedEhcache(Ehcache cache,
			Properties properties) {
//		String cacheName = properties.getProperty("cacheName");
//		switch (cacheName) {
//		case MsgCacheConstants.CACHE_MSG:
//			break;
//
//		default:
//			break;
//		}

		return cache;
	}

}

