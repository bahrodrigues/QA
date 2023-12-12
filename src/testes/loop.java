package testes;

import org.testng.annotations.Test;

public class loop {
    
@Test
public void infinitloop(){
    int i = 1;
    while(i==1){
        System.out.println(i);
    }
}

}
