class Cat (name : String = "Cat") : Animal(name)
{
    override fun makeASound()
    {
        meow()
    }
    private fun meow ()
    {
        println("$animalName said meow!")
    }
}