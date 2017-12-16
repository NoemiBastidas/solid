using discoteca.modelo.entidades;
using discoteca.modelo.persistencia;
using Persona = discoteca.modelo.entidades.Persona;
using PersonaDao = discoteca.modelo.persistencia.PersonaDao;
namespace discoteca.modelo.logica
{
    public class Gestion
    {
        public string permitirIngreso(Persona persona, Salon salon)
        {
            if (persona.edad > 18)
            {
                
                if (salon.capacidad>1)
                {
                    return SalonDao.registrarIngreso(persona,salon);
                }
                else{
                    return "El salón está lleno";
                }
            }
            else
            {
                return "Menores de edad no tiene acceso al salón";
            }

        }


    }
}