/**
 * Project Name:main
 * File Name:DiskStorageCacheFactory.java
 * Package Name:com.hdsx.taxi.driver.cq.cache
 * Date:2014年5月23日上午8:13:52
 * Copyright (c) 2014, sid Jenkins All Rights Reserved.
 * 
 *
*/

package utils.cache.ehcache.factory;

import net.sf.ehcache.Ehcache;
import net.sf.ehcache.event.RegisteredEventListeners;
import net.sf.ehcache.store.disk.DiskStorageFactory;

/**
 * ClassName:DiskStorageCacheFactory
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2014年5月23日 上午8:13:52 
 * @author   sid
 * @see 	 
 */
public class DiskStorageCacheFactory extends DiskStorageFactory {

	public DiskStorageCacheFactory(Ehcache cache,
			RegisteredEventListeners cacheEventNotificationService) {
		
		super(cache, cacheEventNotificationService);
	}

}

