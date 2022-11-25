fun main(args: Array<String>){
    var num: Int = 20

    printfabonacciSerie(num)
}

fun printfabonacciSerie(num:Int){
    var num1: Int = 0
    var num2: Int = 1
    var num3: Int

    var listOfFabonacciNum = ArrayList<Int>()
    var reverseListOfFabonacciNum = ArrayList<Int>()

    listOfFabonacciNum.add(num1)
    listOfFabonacciNum.add(num2)

    for (i in 2 until num){
        num3 = num1 + num2
        listOfFabonacciNum.add(num3)

        num1 = num2
        num2 = num3
    }

    println("Printing list of Fabonacci number upto ($num)th number from collection")

    for (element in listOfFabonacciNum){
        print(" $element")
    }
    println()
    println("------------")

    println("Printing list of Fabonacci number upto ($num)th number in everse order from new collection")

    for (i in listOfFabonacciNum.size -1 downTo 0 ){
        reverseListOfFabonacciNum.add(listOfFabonacciNum[i])
    }

    for (element in reverseListOfFabonacciNum){
        print(" $element")
    }



}