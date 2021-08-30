package en.abramovskyi.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Crime and Punishment")
    private String name;

    @Value("Fyodor Dostoyevsky")
    private String author;

    @Value("1866")
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }
}
