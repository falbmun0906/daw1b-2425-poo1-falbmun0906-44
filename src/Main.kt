fun main() {


    // Si no le paso todos los parámetros al contruir la instancia, el programa lanzará una excepción.

    println("\nCOCHE1 CON TODOS LOS PARÁMETROS ADECUADOS:")
    val coche1 = try {
        Coche("Blanco", "Renault","Clio", 80, 5, "1333HNG")
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
        null
    }
    println(coche1)

    println("\nCOCHE2 CON 800 CV:")
    val coche2 = try {
        Coche("Blanco", "Renault","Clio", 800, 5, "1333HNG")
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
        null
    }
    println(coche1)

    println("\nCOCHE3 CON 2 PUERTAS:")
    val coche3 = try {
        Coche("Blanco", "Renault","Clio", 80, 5, "1333HNG")
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
        null
    }
    println(coche3)

    println("\nCOCHE4 CON 2 PUERTAS:")
    val coche4 = try {
        Coche("Blanco", "Renault","Clio", 80, 5, "1333HNG")
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
        null
    }
    println(coche4)

    println("\nCOCHE5 CON MATRÍCULA DE 8 CARACTERES:")
    val coche5 = try {
        Coche("Blanco", "Renault","Clio", 80, 5, "13333HNG")
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
        null
    }
    println(coche5)

    println("\nCOCHE6 CON VALORES EN BLANCO:")
    val coche6 = try {
        Coche("Blanco", "","", 80, 5, "13333HNG")
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
        null
    }
    println(coche6)
}