package in.jt.journal.db;

import in.jt.journal.dataservice.UserDataService;
import in.jt.journal.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserDataServiceImpl implements UserDataService {
    @Override
    public void saveUser(User user) {

    }
}
