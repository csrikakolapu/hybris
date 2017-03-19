/**
 *
 */
package com.deloitte.facades.order;

import de.hybris.merchandise.facades.order.data.OrderCancelResultData;


/**
 * @author csrikakolapu
 *
 */
public interface OrderCancelFacade
{
	OrderCancelResultData cancelOrder(String orderCode);
}
