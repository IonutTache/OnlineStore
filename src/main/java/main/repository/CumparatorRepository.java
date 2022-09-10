package main.repository;

import main.repository.entity.Cumparator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CumparatorRepository extends JpaRepository<Cumparator,Integer> {
}
