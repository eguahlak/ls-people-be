package dk.cphbusiness.people.control;

import dk.cphbusiness.people.contract.PeopleManager;
import dk.cphbusiness.people.contract.dto.PersonDetail;
import dk.cphbusiness.people.contract.dto.PersonIdentifier;
import dk.cphbusiness.people.contract.dto.PersonSummary;
import dk.cphbusiness.people.model.Person;
import static dk.cphbusiness.people.control.PeopleAssembler.*;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class PeopleManagerBean implements PeopleManager {
  @PersistenceContext(unitName = "PeopleBackendPU")
  private EntityManager em;

  //private Collection<Person> dummies = new Arr
  
  
  @Override
  public Collection<PersonSummary> listPeople() {
    Query query = em.createNamedQuery("Person.findAll");
    Collection<Person> people = query.getResultList();
    // Some other business logic might go here ...
    return createPersonSummaries(people);
    }

  @Override
  public PersonDetail findPerson(PersonIdentifier id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  @Override
  public void savePerson(PersonDetail person) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  public void persist(Object object) {
    em.persist(object);
  }

  }
