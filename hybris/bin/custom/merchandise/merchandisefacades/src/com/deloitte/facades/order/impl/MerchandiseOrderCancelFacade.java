/**
 *
 */
package com.deloitte.facades.order.impl;

import de.hybris.merchandise.facades.order.data.OrderCancelResultData;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.model.ModelService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.deloitte.core.service.CustomOrderCancelService;
import com.deloitte.facades.order.OrderCancelFacade;


/**
 * @author csrikakolapu
 *
 */
public class MerchandiseOrderCancelFacade implements OrderCancelFacade
{



	private static final Logger LOG = Logger.getLogger(MerchandiseOrderCancelFacade.class);

	@Autowired
	private ModelService modelService;

	private CustomOrderCancelService orderCancelService;



	/**
	 * @return the orderCancelService
	 */
	public CustomOrderCancelService getOrderCancelService()
	{
		return orderCancelService;
	}



	/**
	 * @param orderCancelService
	 *           the orderCancelService to set
	 */
	public void setOrderCancelService(final CustomOrderCancelService orderCancelService)
	{
		this.orderCancelService = orderCancelService;
	}



	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.deloitte.facades.order.OrderCancelFacade#cancelOrder(de.hybris.platform.commercefacades.order.data.OrderData)
	 */
	@Override
	public OrderCancelResultData cancelOrder(final String orderCode)
	{
		final OrderCancelResultData result = new OrderCancelResultData();


		final OrderModel orderModel = orderCancelService.getOrderByCode(orderCode);
		orderModel.setStatus(OrderStatus.CANCELLED);
		modelService.save(orderModel);
		result.setOrderId(orderCode);
		result.setSuccess(true);


		return result;
	}





}
