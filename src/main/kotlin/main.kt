fun main() {
    var nums=evenNumbers(listOf("laura","mary","lavyne","Sakina","Grace","Lona","wanjiru","wakadus","wanda","kadus"))
println(nums)
    var heightss=heights(listOf(1.3,1.2,2.6,2.7))
    println(heightss)
    var virgy=Person("Virginia",23,2.5,45)
    var nyc=Person("nancy",20,2.4,56)
    var girls = listOf( virgy,nyc,)
    var h = girls.sortedByDescending { person -> person.age  }
    println(h)
    var wanda = Person("Sabdio", 24, 1.2, 57)
    var wairimu= Person("Wangaree", 16, 2.1, 40)
    var new = mutableListOf(wanda,wairimu)
    println(new.plus(new))
    var subaru= Car("KCH 224B", 56)
    var hilux = Car("KDD 671F", 34)
    var cars = listOf(subaru, hilux)
    println(carDetails(cars))

}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun evenNumbers(majina:List<String>):List<String>{
    majina.forEachIndexed { index, jina ->
        if (index % 2 == 0) {
            println()
        }
    }
    return majina
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heights(height:List<Double>): String {
    var heightTotal=height.sum()
    var averageHeight = height.average()
    var Both = "$heightTotal, $averageHeight"



return Both
    }
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Double,var weight:Int)
fun createMultiplePeople(more:List<Any>):List<Any>{
    return listOf()
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
fun carDetails(f:List<Car>):Int {
    var C = 0
    f.forEach { gari -> gari.mileage
        C += gari.mileage
    }
    var Idadi = C/f.count()
    return Idadi
}

data class Car(var registration:String, var mileage:Int)



