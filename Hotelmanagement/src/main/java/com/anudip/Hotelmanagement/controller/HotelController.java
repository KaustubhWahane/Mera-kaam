package com.anudip.Hotelmanagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anudip.Hotelmanagement.entity.Hotel;
import com.anudip.Hotelmanagement.service.HotelService;
public class HotelController {

	@RestController
	@RequestMapping("/order-details")
	public class OrderController {
	@Autowired
	private HotelService orderService;
	@PostMapping("/save")
	public ResponseEntity<?> saveOrder(@RequestBody() Hotel order) {
		Hotel dborder = orderService.saveOrder(order);
	return ResponseEntity.ok().body(dborder);}
	@GetMapping("/order/{id}")
	public Hotel getData(@PathVariable("id") Long id) {
	return orderService.getOrder(id);}
	@PutMapping("/orderupdate")
	public Hotel updatedata(@RequestBody() Hotel order) {
	return orderService.updateOrder(order);}
	@DeleteMapping("/order/{id}")
	public String deletedate(@PathVariable("id") Long id) {
	Hotel data = orderService.getOrder(id);
	Boolean test=orderService.deleteOrder(id);
	 return (data!=null)?(test)?"deleted sucess":"no id found":"no data found";
	 }
	}
}
