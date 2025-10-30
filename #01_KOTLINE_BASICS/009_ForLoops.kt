fun main(){

    // i : var i
    // 10..20 : i=10 ; i<=20
    // step 2 : i+=2

    for(i in 10..20 step 3){
        println(i)
    }

    // loop to print number in reverse order
    for (i in 10 downTo 0 step 1){
        print("$i ")
    }

    // a loop to print letter of a String
    var name="Mohamed Ali"
    println()
    for(i in name){
        print(i+" ")
    }

    println()
    var names:List<String> = listOf("Ali","Reda","Youssef","Ayman")
    for(name in names){
        println("$name :-) ")
    }



}