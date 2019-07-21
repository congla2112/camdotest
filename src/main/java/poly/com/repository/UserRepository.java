package poly.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import poly.com.entities.Users;


@Repository
public interface UserRepository extends MongoRepository<Users, String>{

}
