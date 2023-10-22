package p4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import p4.core.domain.BookServiceImpl;
import p4.core.driven_ports.BookRepository;
import p4.core.driver_ports.BookService;

@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepository) {
            return new BookServiceImpl(bookRepository);
}
}
