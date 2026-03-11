package in.jt.journal.db.repo;


import in.jt.journal.db.entities.UserEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, ObjectId> {
    UserEntity findByUserName(String username);

    void deleteByUserName(String username);
}
