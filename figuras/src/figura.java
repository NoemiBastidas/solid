


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class figura {

    /**
     * @param args the command line arguments
     */
    String atributo1;
    String atributo2;
    int numeroLados;
    int posicion;
    
     public String impTriangulo(){
        figura triangulo = new figura();
        triangulo.atributo1="base";
        triangulo.atributo2="altura";
        triangulo.numeroLados=3;
        triangulo.posicion=1;
  return "Triangulo Atributo1: "+triangulo.atributo1+" Atributo2: "+triangulo.atributo2+" numero de lados: "+triangulo.numeroLados;
}
    
    public String impCuadrado(){
        figura cuadrado = new figura();
        cuadrado.atributo1="lado";
        cuadrado.atributo2="puntoInicio";
        cuadrado.numeroLados=4;
        cuadrado.posicion=2;
  return "Cuadrado Atributo1: "+cuadrado.atributo1+" Atributo2: "+cuadrado.atributo2+" numero de lados: "+cuadrado.numeroLados;
}
    public String impRectangulo(){
        figura rectangulo = new figura();
        rectangulo.atributo1="lado";
        rectangulo.atributo2="puntoInicio";
        rectangulo.numeroLados=4;
        rectangulo.posicion=2;
  return "Rectangulo Atributo1: "+rectangulo.atributo1+" Atributo2: "+rectangulo.atributo2+" numero de lados: "+rectangulo.numeroLados;
}
    public String impPentagono(){
        figura pentagono = new figura();
        pentagono.atributo1="lado";
        pentagono.atributo2="puntoInicio";
        pentagono.numeroLados=4;
        pentagono.posicion=2;
  return "Pentagono Atributo1: "+pentagono.atributo1+" Atributo2: "+pentagono.atributo2+" numero de lados: "+pentagono.numeroLados;
}
    public String impExagono(){
        figura exagono = new figura();
        exagono.atributo1="lado";
        exagono.atributo2="puntoInicio";
        exagono.numeroLados=4;
        exagono.posicion=2;
  return "Exagono Atributo1: "+exagono.atributo1+" Atributo2: "+exagono.atributo2+" numero de lados: "+exagono.numeroLados;
}
    public String impCirculo(){
        figura circulo = new figura();
        circulo.atributo1="Radio";
        circulo.atributo2="puntoInicio";
        circulo.numeroLados=4;
        circulo.posicion=2;
  return "Circulo1 Atributo1: "+circulo.atributo1+" Atributo2: "+circulo.atributo2+" numero de lados: "+circulo.numeroLados;
}
   
    
    
    
    
    
}
