abstract class Animal( _name: String = "Cat") : IAnimal
{
    val animalName: String = _name
    override fun move (direction : String)
    {
        println("The $animalName moves : $direction")
    }
    abstract override fun makeASound ()
}