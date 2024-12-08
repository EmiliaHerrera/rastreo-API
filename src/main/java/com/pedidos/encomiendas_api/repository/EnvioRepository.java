package com.pedidos.encomiendas_api.repository;

import com.pedidos.encomiendas_api.entity.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EnvioRepository extends JpaRepository<Envio, Long> {
    Optional<Envio> findByDniReceptorAndApellidoReceptor(String dniReceptor, String apellidoReceptor);
}
