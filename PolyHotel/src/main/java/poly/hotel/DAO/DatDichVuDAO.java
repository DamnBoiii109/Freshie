
package Poly.Hotel.dao;

import java.util.List;
import poly.cafe.entity.DatDichVu;

/**
 *
 * @author truon
 */
public interface DatDichVuDAO extends CrudDAO<DatDichVu, String>{ 
    List<DatDichVu> findByCategoryId(String categoryId); 
} 

