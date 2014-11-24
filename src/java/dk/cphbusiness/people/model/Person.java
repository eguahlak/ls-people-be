package dk.cphbusiness.people.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PEOPLE")
@NamedQueries({
    @NamedQuery(
        name = "Person.findAll",
        query = "SELECT p FROM Person p"
        )
    })
public class Person implements Serializable {
  private static final long serialVersionUID = 1L;
  // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
  @Id
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 80)
  private String email;
  
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 40)
  @Column(name = "FIRST_NAME")
  private String firstName;
  
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 40)
  @Column(name = "LAST_NAME")
  private String lastName;
  
  @Basic(optional = false)
  @NotNull
  private int age;

  public Person() { }

  public Person(String email) {
    this.email = email;
    }

  public Person(String email, String firstName, String lastName, int age) {
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    }

  public String getEmail() {
    return email;
    }

  public void setEmail(String email) {
    this.email = email;
    }

  public String getFirstName() {
    return firstName;
    }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
    }

  public String getLastName() {
    return lastName;
    }

  public void setLastName(String lastName) {
    this.lastName = lastName;
    }

  public int getAge() {
    return age;
    }

  public void setAge(int age) {
    this.age = age;
    }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (email != null ? email.hashCode() : 0);
    return hash;
    }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Person)) {
      return false;
      }
    Person other = (Person) object;
    if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
      return false;
      }
    return true;
    }

  @Override
  public String toString() {
    return "dk.cphbusiness.people.model.Person[ email=" + email + " ]";
    }
  
  }
