class Motor constructor(
    private var fuel: Fuel
) {
   private var on: Boolean = false


    fun start(matchVar: Boolean) {
       if (matchVar && fuel.fuelLevel > 0) {
            on = true
           println("motor ligado")
        } else if(!matchVar){
          on = false
           println("motor desligado")
        } else {
            println("Não conseguiu ligar por falta de combustivel")
        }
    }

    fun off() {
        on = false
        println("desligando motor")
    }

    fun status(): Boolean {
        return on
    }
}