package fr.mandre.restaurantmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.mandre.restaurantmenu.content.Restaurant;
import fr.mandre.restaurantmenu.repository.RestaurantRepository;

@RestController
public class RestaurantController {

	@Autowired
	private RestaurantRepository restaurantRepository;

	@RequestMapping(value = "restaurant/{id}", method = RequestMethod.GET)
	public Restaurant restaurant(@PathVariable("id") int id) {
		return restaurantRepository.findById(id).get();
	}

	@RequestMapping(value = "restaurant", method = RequestMethod.POST)
	public void create(@RequestBody Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}
}
