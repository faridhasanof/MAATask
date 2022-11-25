package com.java1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.java1.model.Books;
import com.java1.service.BooksService;
@RestController
public class BooksController 
{
@Autowired
BooksService booksService;
@GetMapping("/book")
private List<Books> getBooks() 
{
return booksService.getBooks();
}
@GetMapping("/book/{id}")
private Books getBooks(@PathVariable("id") int id) 
{
return booksService.getBooksById(bookid);
}
@DeleteMapping("/book/{id}")
private void deleteBook(@PathVariable("id") int id) 
{
booksService.delete(bookid);
}
@PostMapping("/books")
private int saveBook(@RequestBody Books books) 
{
booksService.UpdateSave(books);
return books.getId();
}
@PutMapping("/books")
private Books update(@RequestBody Books books) 
{
booksService.UpdateSave(books);
return books;
}
}
