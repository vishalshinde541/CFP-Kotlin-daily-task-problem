fun main(args: Array<String>){
    var num = 23

    var primeOrNot = isPrimeNumber(num)

    if (primeOrNot){
        println("$num is a prime number")
    }
    else{
        println("$num is not a prime number")
    }
}

fun isPrimeNumber(num: Int): Boolean {
    var isPeimeOrNot: Boolean = false
    if (num == 0 && num == 1) {
        println("$num is not a prime number")
    } else {
        for (i in 2 until num) {

            if (num % i == 0) {
                isPeimeOrNot = false
                break
            }
            else if (i == num - 1) {
                if (num % i != 0) {
                  isPeimeOrNot =  true
                }
            }
        }
    }
    return isPeimeOrNot

}