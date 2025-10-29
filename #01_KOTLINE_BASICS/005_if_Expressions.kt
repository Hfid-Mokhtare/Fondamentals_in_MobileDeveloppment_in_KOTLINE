
fun main(){

    //you can use if condition to asigne the vale to variable message directly

    var v1=5

    val message:String=if(v1>=10){
        println("the result is $v1 you pass")
        "Passe"
    }else if(v1>=5){
        println("the result is $v1 you faile")
        "Fail"
    }else{
        println("errore")
        "Error"
    }


}

