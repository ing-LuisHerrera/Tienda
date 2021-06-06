package com.Quda.Backend.Repositorio;

import com.Quda.Backend.Entidades.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JpaProveedor extends JpaRepository<Supplier,Integer> {

    @Query(value = "SELECT supplier_id FROM suppliers WHERE suppliers_name = :supplier",nativeQuery = true)
    Integer darIdPorProveedorNombre(@Param("supplier") String supplier);

}
