fun main(){

    print("please enter your name : ")
    var input=readln()
    var name=if(input.isEmpty()) "Guest" else input

//    println(name)

    var message=if(name=="Guest") "You are a guest" else "Welcome $name"
    println(message)

}
