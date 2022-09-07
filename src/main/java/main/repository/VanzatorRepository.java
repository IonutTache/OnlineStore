package main.repository;

import main.repository.entity.Vanzator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VanzatorRepository extends JpaRepository<Vanzator,Integer> {

}
