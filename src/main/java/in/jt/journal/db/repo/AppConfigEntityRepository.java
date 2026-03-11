package in.jt.journal.db.repo;

import in.jt.journal.db.entities.AppConfigEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppConfigEntityRepository extends MongoRepository<AppConfigEntity, ObjectId> {

}
