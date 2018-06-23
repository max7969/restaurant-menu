package fr.mandre.restaurantmenu.repository;

import org.springframework.data.repository.CrudRepository;

import fr.mandre.restaurantmenu.content.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
}
