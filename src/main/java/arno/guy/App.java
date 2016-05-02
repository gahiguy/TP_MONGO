package arno.guy;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException

    {
        System.out.println( "Hello World!" );
        Morphia morphia = new Morphia();	
    	Mongo mongo = new Mongo();
    	morphia.map(Person.class).map(Address.class);
    	Datastore ds = morphia.createDatastore(mongo, "mongoTP_SIR");
    	//ObjectId id = new ObjectId("1");
    	for(int i = 0; i<15;i++){
	    	Person p = new Person();
	    	p.setName("Tintin"+i);
	    	
	    	//p.setId(id);
	    	
	    	Address address = new Address();
	    	address.setStreet("123 Some street"+i);
	    	address.setCity("Some city"+i);
	    	address.setPostCode("123 456"+i);
	    	address.setCountry("Some country"+i);
	    	//set address
	    	p.setAdresses(address);
	    	// Save the POJO
	    	Article article = new Article();
	    	article.setName("article"+i);
	    	article.setStars(i);
	    	article.setPersons(p);
	    	
	    	ds.save(address);
	    	ds.save(p);
	    	ds.save(article);
    	}
    	for (Person e : ds.find(Person.class))
    		 System.err.println(e.getAdresses().get(0).getCity());

    }
}
