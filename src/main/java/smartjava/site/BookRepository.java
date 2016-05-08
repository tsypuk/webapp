package smartjava.site;

import smartjava.site.entities.Book;

public interface BookRepository extends GenericRepository<Long, Book>
{
    Book getByIsbn(String isbn);
}
