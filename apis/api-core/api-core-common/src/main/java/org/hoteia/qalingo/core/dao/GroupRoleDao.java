/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.dao;

import org.hoteia.qalingo.core.domain.CustomerGroup;

public interface GroupRoleDao {

	CustomerGroup getCustomerGroupById(Long customerGroupId, Object... params);

	CustomerGroup getCustomerGroupByCode(String code, Object... params);
	
	CustomerGroup saveOrUpdateCustomerGroup(CustomerGroup customerGroup);

	void deleteCustomerGroup(CustomerGroup customerGroup);

}