package in.jt.journal.db;

import in.jt.journal.dataservice.JournalEntryDataService;
import in.jt.journal.db.entities.JournalEntryEntity;
import in.jt.journal.db.entities.UserEntity;
import in.jt.journal.db.repo.JournalEntryRepository;
import in.jt.journal.db.repo.UserRepository;
import in.jt.journal.domain.JournalEntry;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class JournalEntryDataServiceImpl implements JournalEntryDataService {

    private final JournalEntryRepository journalEntryRepository;

    private final UserRepository userRepository;

    private final JournalEntryEntityMapper journalEntryEntityMapper;


    @Override
    public Optional<JournalEntry> findById(ObjectId id) {
        Optional<JournalEntryEntity> journalEntryEntity = journalEntryRepository.findById(id);
        return journalEntryEntity.map(journalEntryEntityMapper::toDomain);
    }

    @Override
    public List<JournalEntry> getAll() {
        List<JournalEntryEntity> journalEntryEntities = journalEntryRepository.findAll();
        return journalEntryEntityMapper.toDomain(journalEntryEntities);
    }

    @Override
    public void saveEntry(JournalEntry journalEntry, String userName) {
        try {
            UserEntity user = userRepository.findByUserName(userName);
            JournalEntryEntity journalEntryEntity = journalEntryEntityMapper.toEntity(journalEntry);
            journalEntryEntity.setDate(LocalDateTime.now());
            JournalEntryEntity saved = journalEntryRepository.save(journalEntryEntity);
            user.getJournalEntries().add(saved);
            userRepository.save(user);
        } catch (Exception e) {
            throw new DataServiceException("An error occurred while saving the entry.", e);
        }
    }

    @Override
    public void saveEntry(JournalEntry journalEntry) {

    }

    @Override
    public boolean deleteById(ObjectId id, String userName) {
        return false;
    }
}
