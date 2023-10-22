package p4.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import p4.core.domain.Book;
import p4.core.domain.BookDoesNotExistException;
import p4.core.driven_ports.BookRepository;
import p4.db_driven_adapter.domain.BookEntity;
import p4.db_driven_adapter.jparepository.HAAJpaRepository;

@Component
public class JpaBookRepository implements BookRepository {

	@Autowired
	private HAAJpaRepository haaJpaRepository;

	@Override
	public Book findById(Long id) {
		Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
		BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
		return bookEntity.toBook();
	}
}
