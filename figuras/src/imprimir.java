
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class imprimir extends figura{
    
    public ArrayList<String> ascendente(){
       ArrayList<String> lista = new ArrayList();
       lista.clear();
       figura fig = new figura();
       lista.add(fig.impTriangulo());
       lista.add(fig.impCuadrado());
       lista.add(fig.impRectangulo());
       lista.add(fig.impPentagono());
       lista.add(fig.impExagono());
       lista.add(fig.impCirculo());
        return lista;
    }
    public ArrayList<String> descendente(){
       ArrayList<String> lista = new ArrayList();
       lista.clear();
       figura fig = new figura();
       lista.add(fig.impCirculo());
       lista.add(fig.impExagono());
       lista.add(fig.impPentagono());
       lista.add(fig.impRectangulo());
       lista.add(fig.impCuadrado());
       lista.add(fig.impTriangulo());
        return lista;
    }
    
}
