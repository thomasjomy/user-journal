package in.jt.journal.domain;

import in.jt.journal.db.entities.JournalEntryEntity;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class User {
    private ObjectId id;

    private String userName;

    private String email;

    private boolean sentimentAnalysis;

    private String password;

    private List<JournalEntryEntity> journalEntries = new ArrayList<>();

    private List<String> roles;
}
