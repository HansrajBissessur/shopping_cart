package com.project.online_shopping.persistence.repo;

import com.project.online_shopping.persistence.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String userName);
}
