/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.hotel.dao;

import Poly.Hotel.entity.DatDichVu;


import poly.hotel.dao.CrudDAO; 
import java.util.List;
import poly.Hotel.entity.ChiTietHoaDon;

public interface ChiTietHoaDonDAO extends CrudDAO<ChiTietHoaDon, Long> {
    List<ChiTietHoaDon> findByHoaDonId(Long hoaDonId);
    List<DatDichVu> findByDatDichVuId(String datDichVuId);
}

