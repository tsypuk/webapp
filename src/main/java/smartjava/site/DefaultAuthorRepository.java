package smartjava.site;

import smartjava.site.entities.Author;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultAuthorRepository extends GenericJpaRepository<Long, Author>
        implements AuthorRepository {

}