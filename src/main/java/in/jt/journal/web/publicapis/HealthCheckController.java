package in.jt.journal.web.publicapis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/public")
@Slf4j
public class HealthCheckController {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Ok";
    }

}
