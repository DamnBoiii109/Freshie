/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.Hotel.dao;

import java.util.List;
import poly.Hotel.entity.ChiTietHoaDon;

/**
 *
 * @author truon
 */
public interface ChiTietHoaDonDAO extends CrudDAO<ChiTietHoaDon, Long>{ 
    List<ChiTietHoaDon> findByHoaDonId(Long HoaDonId); 
    List<DatDichVu> findByDatDichVuId(String DatDichVuId);
}
