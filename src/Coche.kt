class Coche(val color: String?,
            marca: String?,
            modelo: String?,
            private val numeroCaballos: Int?,
            private val numeroPuertas: Int?,
            private val matricula: String?) {

    /* var matricula: String? = matricula
            set(value) {
                require(value?.length== 7) {"La matrícula tiene que tener 7 caracteres"}
            } */

    private var marca: String?
        get() = field?.replaceFirstChar { it.uppercase() } ?: "" // Es como un 'if (marca != null) {}' 'else marca = ""
        private set

    private var modelo: String?
        get() = field?.replaceFirstChar { it.uppercase() } ?: ""
        private set

    init {
        require(!marca.isNullOrEmpty()) {"'Marca' no puede ser nula o vacía."}
        require(!modelo.isNullOrEmpty()) {"'Modelo' no puede ser nulo o vacío."}
        require(numeroCaballos != null) {"'Número de caballos' no puede ser nulo."}
        require(numeroPuertas !=  null) {"'Número de puertas' no puede ser nulo."}
        require(matricula?.length == 7) {"'Matrícula' tiene que tener 7 caracteres."}
        require(!color.isNullOrEmpty()) {"'Color' no puede ser nulo."}
        require(numeroCaballos in 70..700) {"CV debe estar entre 70 y 700."}
        require(numeroPuertas in 3..5) {"CV debe estar entre 70 y 700."}
        this.marca = marca
        this.modelo = modelo
    }

    override fun toString(): String {
        return "MARCA: $marca MODELO: $modelo COLOR: $color NÚMERO DE PUERTAS: $numeroPuertas NÚMERO DE CABALLOS: $numeroCaballos MATRÍCULA: $matricula"
    }
}