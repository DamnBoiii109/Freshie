
package poly.hotel.dao;

import Poly.Hotel.entity.DatDichVu;
import java.util.List;


/**
 *
 * @author truon
 */
public interface DatDichVuDAO extends CrudDAO<DatDichVu, String>{ 
    List<DatDichVu> findByLoaiPhongId(String LoaiPhongId); 
} 

