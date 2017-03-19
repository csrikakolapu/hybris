/**
 *
 */
package com.deloitte.core.service.impl;

import de.hybris.platform.core.model.order.OrderModel;

import com.deloitte.core.dao.MerchandiseOrderDao;
import com.deloitte.core.service.CustomOrderCancelService;


/**
 * @author csrikakolapu
 *
 */
public class MerchandiseOrderCancelService implements CustomOrderCancelService
{



	private MerchandiseOrderDao orderDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.deloitte.core.service.OrderCancelService#isOrderCancelable()
	 */
	@Override
	public boolean isOrderCancelable()
	{
		// YTODO Auto-generated method stub
		return false;
	}

	/**
	 * @return the orderDao
	 */
	public MerchandiseOrderDao getOrderDao()
	{
		return orderDao;
	}

	/**
	 * @param orderDao
	 *           the orderDao to set
	 */
	public void setOrderDao(final MerchandiseOrderDao orderDao)
	{
		this.orderDao = orderDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.deloitte.core.service.OrderCancelService#getOrderByCode(java.lang.String)
	 */
	@Override
	public OrderModel getOrderByCode(final String orderCode)
	{
		return orderDao.getOrderByCode(orderCode);
	}

}
