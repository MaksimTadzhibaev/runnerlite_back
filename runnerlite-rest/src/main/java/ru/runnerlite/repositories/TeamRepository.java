package ru.runnerlite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.runnerlite.entities.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}