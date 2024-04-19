package com.javierlobato.apirest.apirest.Repositories;
import com.javierlobato.apirest.apirest.Entities.Producto;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
