package en.abramovskyi.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Crime and Punishment")
    private String name;

    public String getName() {
        return name;
    }
}
