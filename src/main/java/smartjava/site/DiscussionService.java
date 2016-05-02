package smartjava.site;

import smartjava.site.entity.Discussion;

import java.util.List;

public interface DiscussionService
{
    List<Discussion> getAllDiscussions();
    Discussion getDiscussion(long id);
    void saveDiscussion(Discussion discussion);
}