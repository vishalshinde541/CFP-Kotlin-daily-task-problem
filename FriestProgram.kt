
// check given string is palindrome or not
fun main(args: Array<String>) {
    println("Hello world")

    var orgString = "madam"

    isPalindrome(orgString)
}
fun isPalindrome (orgString: String): Pair<Int, String> {
    var revString: String = ""

    for (i in orgString.length - 1 downTo 0){
        revString = revString + orgString.elementAt(i)
    }

//    if (orgString == revString){
//        println("Given string is palindrome")
//    }else{
//        println("Given string is not a palindrome")
//    }

    var pair = Pair(10 ,"abc")

     return pair
}
