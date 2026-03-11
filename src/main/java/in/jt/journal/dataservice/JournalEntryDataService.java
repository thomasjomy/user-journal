package in.jt.journal.dataservice;

import in.jt.journal.domain.JournalEntry;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface JournalEntryDataService {

    Optional<JournalEntry> findById(ObjectId id);

    List<JournalEntry> getAll();

    void saveEntry(JournalEntry journalEntry, String userName);

    public void saveEntry(JournalEntry journalEntry);

    public boolean deleteById(ObjectId id, String userName);


}
