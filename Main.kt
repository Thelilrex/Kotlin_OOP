fun main()
{
    val animal : Animal = Dog("Hachiko")

    val cat : Animal = Cat("Tom")

    val mouse: Animal = Mouse("Jerry")

    moveAndMakeASound(animal)
    moveAndMakeASound(cat)
    moveAndMakeASound(mouse)
}

fun moveAndMakeASound(animal:Animal)
{
    animal.move("East")
    animal.makeASound()
}