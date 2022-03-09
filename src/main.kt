fun main(){
    nameofFruits(arrayOf("coconut","pinneaaple","watermellon","apple"))
    getCities(arrayOf("harare","mumbai","dodoma","jakarta"))
    arrayOfNumbers(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    namesofCars(arrayOf("Jeep","Subaru","Ferrari"))




}
fun nameofFruits(name:Array<String>){
    println(name.contentToString())
}
fun getCities(name:Array<String>){
    name.forEach { names ->
        println(names.capitalize())

    }

}
fun arrayOfNumbers(num:Array<Int>){
    var numbers=num[2] + num[5]
    println (numbers)

    var intergers=num.indexOf(158)
    println(intergers)

    var answer=num.sortedArray()
    println(answer.contentToString())
}
fun namesofCars(names:Array<String>):Array<String>{
    var cars = names
    println (cars.contentToString())
    return cars

}



