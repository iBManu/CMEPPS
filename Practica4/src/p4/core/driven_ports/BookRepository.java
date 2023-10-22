package p4.core.driven_ports;

import p4.core.domain.Book;

public interface BookRepository {
	Book findById(Long id);
}