package pe.edu.ulima.cinalunatg.modelo

import java.util.*

data class Alumno(
    val name: String,
    val id: String)

class GestorAlumnos {

    fun obtenerAlumnos(): List<Alumno> {
        val alumnos = ArrayList<Alumno>()
        alumnos.add(Alumno("Andrea Fernandez", "20151876"))
        alumnos.add(Alumno("Jhordy Lopez", "20132902"))
        alumnos.add(Alumno("Alejandro Silva", "20181799"))
        return alumnos
    }

    companion object {
        private var instance: GestorAlumnos? = null

        fun getInstance(): GestorAlumnos {
            if (instance == null) {
                instance = GestorAlumnos()
            }
            return instance!!
        }
    }
}