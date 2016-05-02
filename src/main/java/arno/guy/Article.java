package arno.guy;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity("articles")
//@Indexes(
 //   @Index(value = "salary", fields = @Field("salary"))
//)
public class Article {

	
	@Id
    private ObjectId id;
    private String name;
    private int stars;
   
    @Reference
    List<Person> persons;
    
	public Article() {
		super();
		// TODO Auto-generated constructor stub
		this.persons = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(Person persons) {
		this.persons.add(persons);
	}
    
    
}
