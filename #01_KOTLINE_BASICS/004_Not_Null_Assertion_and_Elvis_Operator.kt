fun main(){
    // the value of v1 can be null "?"
    var v1:Int?= 5

    // we use not null Assortion"!!" if we are sure that the value is not null
    v1=v1!!.dec()
    println(v1)

    //------------------------------------

    // in case that the v2?.dec() is a null , the type of v3 shude be a nulable Int
    var v2:Int?=null
    var v3:Int?=v2?.dec()
    println(v3)

    //------------------------------------

    // ?: Elvis operator use if the expression to the left is null he return the value on the righte
    // and if the expression to the left is not null he returns it
    var v4:Int?=5
    var v5:Float?=v4?.toFloat() ?: 7f
    println(v5)

}