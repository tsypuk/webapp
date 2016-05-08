package smartjava.site.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Authors", indexes = {
        @Index(name = "Authors_Names", columnList = "AuthorName")
})
public class Author implements Serializable
{
    private long id;
    private String name;
    private String emailAddress;
    private Gender gender;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AuthorId")
    public long getId()
    {
        return this.id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "AuthorName")
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Basic
    public String getEmailAddress()
    {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    @Enumerated(EnumType.STRING)
    public Gender getGender()
    {
        return this.gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }
}
