class NewYorkCoffeShop(americanoPrice:Double, cappuccinoPrice:Double, lattePrice: Double):
    CoffeShop(americanoPrice, cappuccinoPrice, lattePrice) {

    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in NY")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thanks for order Cappuccino in NY")

    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Latte in NY")

    }
}