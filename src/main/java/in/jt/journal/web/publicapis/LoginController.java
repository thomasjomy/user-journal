package in.jt.journal.web.publicapis;

import in.jt.journal.web.dto.LoginRequest;
import in.jt.journal.web.dto.LoginResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/public")
@Slf4j
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        try {
            return new ResponseEntity<>(new LoginResponse(), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Exception occurred while createAuthenticationToken ", e);
            LoginResponse loginResponse = new LoginResponse();
            loginResponse.setMessage("Incorrect username or password");
            return new ResponseEntity<>(loginResponse, HttpStatus.BAD_REQUEST);
        }
    }

}
