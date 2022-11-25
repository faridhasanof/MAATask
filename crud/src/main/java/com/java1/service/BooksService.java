package com.java1.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java1.model.Books;
import com.java1.repository.BooksRepository;

@Service
public class BooksService 
{
@Autowired
BooksRepository booksRepository;
public List<Books> getBooks() 
{
List<Books> books = new ArrayList<Books>();
booksRepository.findAll().forEach(books1 -> books.add(books1));
return books;
}
public Books getBooksById(int id) 
{
return booksRepository.findById(id).get();
}
public void UpdateSave(Books books) 
{
booksRepository.save(books);
}
public void delete(int id) 
{
booksRepository.deleteById(id);
}
public void update(Books books, int id) 
{
booksRepository.save(books);
}
}