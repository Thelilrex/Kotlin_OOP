class Mouse(name: String = "Jerry"): Animal(name)
{
    private var CheeseAmount: Int = 0
    override fun makeASound()
    {
        squeaks()
    }
    private fun squeaks()
    {
        println("$animalName said squeak!")
    }
    public fun StealCheese(num:Int)
    {
        CheeseAmount += num
    }
    public fun EatCheese()
    {
        CheeseAmount--
    }
}