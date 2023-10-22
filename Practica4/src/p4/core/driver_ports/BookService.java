package p4.core.driver_ports;

import p4.core.domain.Book;

public interface BookService {
	Book getBook(Long id);
}
