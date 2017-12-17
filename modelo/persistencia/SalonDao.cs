using discoteca.modelo.entidades;

namespace discoteca.modelo.persistencia
{
    public class SalonDao : Gestionable
    {
       
        public static string registrarIngreso(Persona persona, Salon salon){
            //Código para registrar el ingreso de una persona
            return "EL ingreso es correcto";
        }

        public bool eliminar(int indice)
        {
            throw new System.NotImplementedException();
        }

        public bool guardar(object objeto)
        {
            throw new System.NotImplementedException();
        }

        public bool modificar(int indice, object objeto)
        {
            throw new System.NotImplementedException();
        }

        public object obtener()
        {
            throw new System.NotImplementedException();
        }
    }
}