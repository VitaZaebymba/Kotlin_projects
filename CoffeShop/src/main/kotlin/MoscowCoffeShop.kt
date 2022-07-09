class MoscowCoffeShop(americanoPrice:Double, cappuccinoPrice:Double, lattePrice: Double):
    CoffeShop(americanoPrice, cappuccinoPrice, lattePrice), Biscuits {

    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in Moscow")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thanks for order Cappuccino in Moscow")

    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Latte in Moscow")

    }

    override fun sellBiscuits() {
        println("Take your biscuits")
    }
}