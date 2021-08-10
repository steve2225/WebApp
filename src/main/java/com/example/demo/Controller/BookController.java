package com.example.demo.Controller;

import com.example.demo.Entity.Book;
import com.example.demo.Service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public String  getBook(Model theModel){
        List<Book> theBooks=bookService.getAllBooks();
        theModel.addAttribute("books", theBooks);
        return "list-books";
    }

    @GetMapping("fromAdd")
    public String formAdd(Model theModel){
        Book theBook=new Book();
        theModel.addAttribute("books", theBook);
        return "book-form";
    }

    @GetMapping("formUpdate")
    public String formUpdate(@RequestParam("bookId") int id, Model theModel){
        Book theBook=bookService.findBookById(id);
        theModel.addAttribute("books", theBook);
        return "book-form";
    }
    @PostMapping("/save")
    public String saveBook(@ModelAttribute("books") Book theBook){
        bookService.addBook(theBook);
        return "redirect:/books/list";
    }

    @GetMapping("/delete")
    public String deleteBook(@RequestParam("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/books/list";
    }

}
