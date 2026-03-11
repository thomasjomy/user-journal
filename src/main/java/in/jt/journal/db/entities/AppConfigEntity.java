package in.jt.journal.db.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "app_config")
@Data
@NoArgsConstructor
public class AppConfigEntity {

    private String key;
    private String value;

}
