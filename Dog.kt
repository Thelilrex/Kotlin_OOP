class Dog (name : String = "Dog") : Animal(name)
{
    override fun makeASound()
    {
        bark()
    }
    private fun bark ()
    {
        println("$animalName said woof")
    }
}