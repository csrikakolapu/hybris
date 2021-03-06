/**
 *
 */
package com.deloitte.storefront.controllers.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deloitte.marchandise.facades.order.data.OrderCancelResultData;
import com.deloitte.marchandise.facades.order.impl.MerchandiseOrderCancelFacade;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractSearchPageController;


/**
 * @author csrikakolapu
 *
 */
@Controller
@RequestMapping("/my-account")
public class OrderCancelController extends AbstractSearchPageController
{
	@Autowired
	MerchandiseOrderCancelFacade merchandiseOrderFacade;
	private static final String REDIRECT_TO_ORDERS = REDIRECT_PREFIX + "/my-account/orders";

	@RequestMapping(value = "/order/cancel/{orderCode}", method = RequestMethod.POST)
	public String orderCancel(@PathVariable("orderCode") final String orderCode, final RedirectAttributes redirectAttributes)

	{
		final OrderCancelResultData cancelResult = merchandiseOrderFacade.cancelOrder(orderCode);
		redirectAttributes.addFlashAttribute("orderCancelResult", cancelResult);
		return REDIRECT_TO_ORDERS;
	}
}
