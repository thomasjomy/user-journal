package in.jt.journal.db.repo;

import in.jt.journal.db.entities.JournalEntryEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntryEntity, ObjectId> {

}
