/**
 *
 */
package com.deloitte.core.service.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.order.daos.OrderDao;

import com.deloitte.core.service.CustomOrderCancelService;


/**
 * @author csrikakolapu
 *
 */
public class MerchandiseOrderCancelService implements CustomOrderCancelService
{

	/**
	 * @return the orderDao
	 */
	public OrderDao getOrderDao()
	{
		return orderDao;
	}

	/**
	 * @param orderDao
	 *           the orderDao to set
	 */
	public void setOrderDao(final OrderDao orderDao)
	{
		this.orderDao = orderDao;
	}

	private OrderDao orderDao;

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
