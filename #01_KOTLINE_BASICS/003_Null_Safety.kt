fun main(){
    // making variable that can have null value
    var v:Int?=null
    v=5

    // v? : this called null safty operator to check
    // if the variable hase the null value or not
    // if not the other functions work normale
    println(v?.dec())
    println(v?.dec()?.dec())
}
