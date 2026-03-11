package in.jt.journal.db;

import in.jt.journal.db.entities.UserEntity;
import in.jt.journal.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
    UserEntity toEntity(User user);

    User toDomain(UserEntity userEntity);
}
