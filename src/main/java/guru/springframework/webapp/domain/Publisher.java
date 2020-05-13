package guru.springframework.webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String addresLine1;
    private String city;
    private String state;
    private String zip;

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(id, publisher.id) &&
                Objects.equals(firstName, publisher.firstName) &&
                Objects.equals(addresLine1, publisher.addresLine1) &&
                Objects.equals(city, publisher.city) &&
                Objects.equals(state, publisher.state) &&
                Objects.equals(zip, publisher.zip);
    }

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher() {
    }

    public Publisher( String firstName, String addresLine1, String city, String state, String zip ) {
        this.firstName = firstName;
        this.addresLine1 = addresLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks( Set<Book> books ) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getAddresLine1() {
        return addresLine1;
    }

    public void setAddresLine1( String addresLine1 ) {
        this.addresLine1 = addresLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState( String state ) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip( String zip ) {
        this.zip = zip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", addresLine1='" + addresLine1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
