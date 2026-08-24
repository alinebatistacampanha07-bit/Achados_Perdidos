package achadoseperdidos.java.demo.repository;

import achadoseperdidos.model.ObjetoPerdido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ObjetoRepository extends JpaRepository<ObjetoPerdido, Long> {
    List<ObjetoPerdido> findByNomeContaining(String nome);
    List<ObjetoPerdido> findByLocalContaining(String local);
}

