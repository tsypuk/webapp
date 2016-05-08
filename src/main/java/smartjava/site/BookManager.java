package smartjava.site;

import smartjava.site.entities.Author;
import smartjava.site.entities.Book;
import smartjava.site.entities.Publisher;

import java.util.List;

public interface BookManager
{
    List<Author> getAuthors();

    List<Book> getBooks();

    List<Publisher> getPublishers();

    void saveAuthor(Author author);

    void saveBook(Book book);

    void savePublisher(Publisher publisher);
}
