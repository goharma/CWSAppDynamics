import org.jboss.*;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Created by kdooley on 10/23/2014.
 */


public class UpdateHostFile{
    private ObjectFactory of;

    public static void main(String args[]){
        // Unmarshall
        Unmarshaller jaxbUnmarshaller = null;
        try {
            File file = new File("stage/host/fdsqn1vparwap01.host.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Host.class);

            try{
                jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            }catch (NumberFormatException nfe){}
            Host host = (Host) jaxbUnmarshaller.unmarshal(file);
            System.out.println(host);
        }catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
