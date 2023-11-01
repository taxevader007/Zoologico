package model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jaula {
    String norte = "Norte";
    String sur = "Sur";
    String grande = "Grande";
    String mediana = "Mediana";
    String pequena = "Pequena";
    int capacidad_grande = 10;
    int capacidad_mediana = 6;
    int capacidad_pequena = 2;
    String sector;
    String tamano;

    
}
