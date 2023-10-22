package p4.core.domain;

import p4.core.driven_ports.BookRepository;
import p4.core.driver_ports.BookService;

public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Book getBook(Long id) {
		return bookRepository.findById(id);
	}
}