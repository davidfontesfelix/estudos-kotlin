fun main() {
    val david = Human()
    david.name = "David Fontes"

    val dog = Dog()
    dog.owner = (david)
    dog.name = "Linux"
    dog.sayHi()

    val paulo = Human()
    paulo.name = "Paulo Alberto"
    dog.owner = (paulo)
    dog.sayHi()
}