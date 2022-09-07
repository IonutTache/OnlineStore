package main.repository;

import main.repository.entity.Produs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdusRepository extends JpaRepository<Produs,Integer> {

}
