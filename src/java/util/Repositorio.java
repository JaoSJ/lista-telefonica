package util;

import java.util.ArrayList;
import org.apache.xml.security.c14n.helper.C14nHelper;

public class Repositorio {

    ArrayList<Contatos> myArray;

    public Repositorio() {
        
        
        Contatos c1 = new Contatos();
        Contatos c2 = new Contatos();
        
        c1.setNome("Vinicius");
        c1.setTelefone("8888888");
               
        c2.setNome("Cleison");
        c2.setTelefone("666666");
    
        
        myArray = new ArrayList();
        myArray.add(c1);
        myArray.add(c2);
    
    }
    
    public ArrayList<Contatos> getContatos(){
        return myArray;
    }
    
}
