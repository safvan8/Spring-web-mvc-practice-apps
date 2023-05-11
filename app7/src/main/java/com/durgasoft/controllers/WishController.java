package com.durgasoft.controllers;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// logic for generating wiish message

		
		LocalTime time = LocalTime.now();
		int hour = time.getHour();

		String generatedWishMessage = "";

		if (hour < 12)
			generatedWishMessage = "Good morning !!!";
		else if (hour < 17)
			generatedWishMessage = "Good After noon!!";
		else
			generatedWishMessage = "Good Evening !!!!!!";
		
		                        // pageName  // Map Key , Map value
		return new ModelAndView("outputPage", "message", generatedWishMessage);
	}
}
