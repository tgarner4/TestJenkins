package my.controller;

import my.model.Book;
import my.service.BookService;
import org.jeasy.random.EasyRandom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/v1")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class BookControllerV1 {

    private BookService bookService;


    @Autowired
    public BookControllerV1(BookService bookService) {
        this.bookService = bookService;
    }

    @GET
    @Path("get/{bookId}")
    public Book getBook(@PathParam("bookId") Long bookId){
        return bookService.findById(bookId);
    }

    @GET
    @Path("findAll")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GET
    @Path("gen")
    public String generateData(){
        EasyRandom easyRandom = new EasyRandom();
        for (int i = 0; i < 3; i++) {
            Book book = easyRandom.nextObject(Book.class);
            bookService.save(book);
        }
        return "OK";
    }


}
