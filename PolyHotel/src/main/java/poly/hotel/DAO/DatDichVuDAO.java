
package Poly.Hotel.dao;

import java.util.List;
import poly.cafe.entity.Drink;

/**
 *
 * @author truon
 */
public interface DrinkDAO extends CrudDAO<Drink, String>{ 
    List<Drink> findByCategoryId(String categoryId); 
} 

