package ru.runnerlite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.runnerlite.entities.User;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
	@Override
	<S extends User> S save(S entity);
}
