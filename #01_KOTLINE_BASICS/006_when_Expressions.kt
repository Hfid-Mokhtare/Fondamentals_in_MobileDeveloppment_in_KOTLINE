fun main(){


    var prise:Int=100

    // to make a comparison in a range of Int you have to use <in>
    // and don't forget the else at the end of when
    // after a line cas is true , the <when> run the ligne and stop automaticly auto break
    when (prise){
        0 -> println("this product is for free")
        in 20..49 -> println("this product is for small companies")
        in 50..69 -> println("this product is for medium companies")
        in 70..100 -> println("this product is for large companies")
        else -> println("this product is for big companies")
    }

    // you make use <when> without adding a variable to check , but you have to add boolean expressions
    // if the case was true you can run a block of code
    // you can reasigne the return of <when> to a variable
    var type:String=when{
        prise<100 -> {
            println("this product is small companies")
            "small"
        }
        (prise>=100) && (prise <1000) -> {
            println("this product is for medium companies")
            "medium"
        }
        else -> "this product is for big companies"
    }
    println(type)
}