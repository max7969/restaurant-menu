package fr.mandre.restaurantmenu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.mandre.restaurantmenu.content.Restaurant;

@RestController
public class RestaurantController {

	@RequestMapping(value = "restaurant/{id}", method = RequestMethod.GET)
	public Restaurant restaurant(@PathVariable("id") int id) {
		Restaurant restaurant = new Restaurant();
		restaurant.setId(id);
		restaurant.setName("sampleName");
		return restaurant;
	}
}
