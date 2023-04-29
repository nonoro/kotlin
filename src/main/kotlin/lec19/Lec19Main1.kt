package lec19

import lec17.Fruit
import lec19.a.printHelloWorld as printHelloWorldA
import lec19.b.printHelloWorld as printHelloWorldB



// typeAlias
typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruit: List<Fruit>, filter: FruitFilter) {

}

// as import
fun main() {

    printHelloWorldA()
    printHelloWorldB()

}

