/**
 *
 */
package com.deloitte.controllers.pages;

import de.hybris.merchandise.facades.order.data.OrderCancelResultData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deloitte.facades.order.OrderCancelFacade;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractSearchPageController;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;



/**
 * @author csrikakolapu
 *
 */
@Controller
@RequestMapping("/custom")
public class OrderCancelController extends AbstractSearchPageController
{


	@Autowired
	OrderCancelFacade merchandiseOrderFacade;

	private static final String REDIRECT_TO_ORDERS = REDIRECT_PREFIX + "/my-account/orders";

	@RequestMapping(value = "/cancelOrder/{orderCode}", method = RequestMethod.POST)
	@RequireHardLogIn
	public String orderCancel(@PathVariable("orderCode") final String orderCode, final RedirectAttributes redirectAttributes)

	{

		final OrderCancelResultData cancelResult = merchandiseOrderFacade.cancelOrder(orderCode);
		redirectAttributes.addFlashAttribute("orderCancelResult", cancelResult);

		return REDIRECT_TO_ORDERS;
	}

	@RequestMapping(value = "/cancelOrder/{orderCode}", method = RequestMethod.GET)
	@RequireHardLogIn
	public String orderCancelV2(@PathVariable("orderCode") final String orderCode, final RedirectAttributes redirectAttributes)

	{

		final OrderCancelResultData cancelResult = merchandiseOrderFacade.cancelOrder(orderCode);
		redirectAttributes.addFlashAttribute("orderCancelResult", cancelResult);

		return REDIRECT_TO_ORDERS;
	}
}
