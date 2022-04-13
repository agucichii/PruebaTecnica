/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ricoh.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RegistroService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegistroService
 * @generated
 */
public class RegistroServiceWrapper
	implements RegistroService, ServiceWrapper<RegistroService> {

	public RegistroServiceWrapper(RegistroService registroService) {
		_registroService = registroService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _registroService.getOSGiServiceIdentifier();
	}

	@Override
	public RegistroService getWrappedService() {
		return _registroService;
	}

	@Override
	public void setWrappedService(RegistroService registroService) {
		_registroService = registroService;
	}

	private RegistroService _registroService;

}