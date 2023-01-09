package com.anudip.Hotelmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.anudip.Hotelmanagement.entity.Hotel;

	@Repository
	public interface HotelRepository extends JpaRepository<Hotel, Long> { 
		
	
}
