package main.repository;

import main.repository.entity.Vanzator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VanzatorRepository extends JpaRepository<Vanzator,Integer> {

}
