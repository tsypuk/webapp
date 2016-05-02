package smartjava.site;

import smartjava.site.entity.Discussion;

import java.util.List;

public interface DiscussionRepository
{
    List<Discussion> getAll();
    Discussion get(long id);
    void add(Discussion discussion);
    void update(Discussion discussion);
    void delete(long id);
}