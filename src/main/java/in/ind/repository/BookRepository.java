package in.ind.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ind.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
