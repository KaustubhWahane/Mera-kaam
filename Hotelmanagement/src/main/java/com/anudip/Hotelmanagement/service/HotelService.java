package com.anudip.Hotelmanagement.service;
import com.anudip.Hotelmanagement.entity.Hotel;

	public interface HotelService {
		Hotel saveOrder(Hotel order);
		Hotel updateOrder(Hotel order);
		Hotel getOrder(Long orderId);
		Boolean deleteOrder(Long orderId);
	}

