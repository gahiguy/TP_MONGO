package arno.guy;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;


@Entity("Persons")
public class Person {
	@Id
	
    private ObjectId id;
    private String name;
    @Reference
    List<Address> adresses ;
    
    
	
    
    public Person() {
		super();
		this.adresses = new ArrayList<Address>();
		// TODO Auto-generated constructor stub
	}
    
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAdresses() {
		return adresses;
	}
	public void setAdresses(Address adress) {
		this.adresses.add(adress);
	}
}
