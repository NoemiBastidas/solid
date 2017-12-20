using System;
using discoteca.modelo.entidades;

namespace discoteca.modelo.persistencia
{
    public interface Gestionable
    {
        bool guardar(Object objeto);
        bool modificar(int indice, Object objeto);
        bool eliminar(int indice);
        Object obtener();

    }
}