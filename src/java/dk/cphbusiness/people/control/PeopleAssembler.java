package dk.cphbusiness.people.control;

import dk.cphbusiness.people.contract.dto.PersonSummary;
import dk.cphbusiness.people.model.Person;
import java.util.ArrayList;
import java.util.Collection;

public class PeopleAssembler {
  
  public static PersonSummary createPersonSummary(Person person) {
    return new PersonSummary(
        person.getEmail(), 
        person.getFirstName()+" "+person.getLastName()
        );
    }
  
  public static Collection<PersonSummary> createPersonSummaries(Collection<Person> people) {
    Collection<PersonSummary> summaries = new ArrayList<>();
    for (Person person : people) summaries.add(createPersonSummary(person));
    return summaries;
    }
  
  
  }
