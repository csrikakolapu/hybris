/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.deloitte.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.deloitte.fulfilmentprocess.constants.MarchandiseFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class MarchandiseFulfilmentProcessManager extends GeneratedMarchandiseFulfilmentProcessManager
{
	public static final MarchandiseFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MarchandiseFulfilmentProcessManager) em.getExtension(MarchandiseFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
