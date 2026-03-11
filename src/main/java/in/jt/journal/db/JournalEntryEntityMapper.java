package in.jt.journal.db;

import in.jt.journal.db.entities.JournalEntryEntity;
import in.jt.journal.domain.JournalEntry;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JournalEntryEntityMapper {

    JournalEntryEntity toEntity(JournalEntry journalEntry);

    List<JournalEntryEntity> toEntity(List<JournalEntry> journalEntryEntity);

    JournalEntry toDomain(JournalEntryEntity journalEntryEntity);

    List<JournalEntry> toDomain(List<JournalEntryEntity> journalEntryEntity);

}
