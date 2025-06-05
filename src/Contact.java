//Source: https://spring.io/guides/gs/accessing-data-jpa
// https://www.baeldung.com/hibernate-search
// https://medium.com/@ramanamuttana/connect-hibernate-with-postgres-d8f29249db0c


import jakarta.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "name")
    private String name;

    @Column(name = "surnames")
    private String surnames;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    //Needed by hibernate
    protected Contact(){};

    protected Contact(String name, String surnames, String phone, String email) {
        this.name = name;
        this.surnames = surnames;
        this.phone = phone;
        this.email = email;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public String getSurnames() {
        return this.surnames;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return String.format("ID: %d\n  Name: %s\n  Surname: %s\n  Phone: %s\n  Email: %s", this.ID, this.name, this.surnames, this.phone, this.email);
    }

    public String toFileContent(){
        return String.format("%d\n%s\n%s\n%s\n%s", this.ID, this.name, this.surnames, this.phone, this.email);
    }
}
