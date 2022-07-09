import kotlin.system.exitProcess

fun main() {
    val moscowCoffeShop = MoscowCoffeShop(3.0, 4.50, 5.0)
    val newYorkCoffeShop = NewYorkCoffeShop(5.0, 7.50, 8.0)

    while(true) {
        println("Hello. Choose a city:")
        println("1. Moscow\n2. New York\n\n0. Exit")

        var currentCoffeShop: CoffeShop = when (readLine()) {
            "1" -> moscowCoffeShop
            "2" -> newYorkCoffeShop
            "0" -> break
            else -> {
                println("Error")
                exitProcess(1)
            }
        }
        println("Choose a drink:")
        println("1. Americano\n2.Capuccino\n3.Latte\n\n0. Show statistics")

        when (readLine()) {
            "1" -> {
                currentCoffeShop.makeAmericano()
                checkAndAskForBuscuits(currentCoffeShop)
            }
            "2" -> {
                currentCoffeShop.makeCappuccino()
                checkAndAskForBuscuits(currentCoffeShop)
            }
            "3" -> {
                currentCoffeShop.makeLatte()
                checkAndAskForBuscuits(currentCoffeShop)
            }
            "0" -> currentCoffeShop.showStatistics()
            else -> {
                println("Error")
                exitProcess(1)
            }
        }

    }

}
fun checkAndAskForBuscuits(currentCoffeShop: CoffeShop){
    if (currentCoffeShop is Biscuits) {
        println("Would you like biscuits?")
        println("1. Yes\n2.No")

        val isBiscuits = readLine()

        if (isBiscuits == "1")
            currentCoffeShop.sellBiscuits()

    }
}
