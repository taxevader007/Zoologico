package model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Zologico {
    int cant_jaulas = 10;
    
    public void darJaulas(){
        
        Jaula[] jaula;
        jaula= new Jaula[10];
        
        darJaulas();
        
    }
}
