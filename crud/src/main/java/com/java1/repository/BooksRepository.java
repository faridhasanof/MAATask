package com.java1.repository;
import org.springframework.data.repository.CrudRepository;
import com.java1.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
