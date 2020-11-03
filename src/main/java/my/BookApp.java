package my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BookApp  {

    public static void main(String[] args) {
        SpringApplication.run(BookApp.class, args);
    }



    /*@Bean
    public ApplicationRunner bookInit(@Autowired BookService bookService) {
        return args -> {
            EasyRandom easyRandom = new EasyRandom();
            for (int i = 0; i < 10; i++) {
                Book book = easyRandom.nextObject(Book.class);
                bookService.save(book);
            }

            System.out.println("Hello World");
        };

    }*/
}
