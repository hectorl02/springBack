package com.myback.hectorl.dao;

import com.myback.hectorl.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto,Long> {

}
