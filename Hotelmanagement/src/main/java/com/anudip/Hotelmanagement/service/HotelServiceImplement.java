package com.anudip.Hotelmanagement.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.Hotelmanagement.entity.Hotel;
import com.anudip.Hotelmanagement.repository.HotelRepository;

	@Service
	public class HotelServiceImplement implements HotelService {
	@Autowired
	private HotelRepository hotelRepository;
	@Override
	public Hotel saveOrder(Hotel order) {
	return hotelRepository.save(order);}
	@Override
	public Hotel updateOrder(Hotel order) {
		Hotel getdata=getOrder(order.getOrderId());
		Hotel updateData=new Hotel();
	if(getdata!=null) {
	updateData.setOrderId(order.getOrderId());
	updateData.setAddress(getdata.getAddress());
	updateData.setOrderName(getdata.getOrderName());
	updateData.setPrice(order.getPrice());}
	return hotelRepository.save(updateData);}
	@Override
	public Hotel getOrder(Long orderId) {
		return hotelRepository.findById(orderId).orElseThrow(()->new RuntimeException("Id not found!!!"));
	}
	@Override
	public Boolean deleteOrder(Long orderId) {
		hotelRepository.deleteById(orderId);
	return true;}
}
