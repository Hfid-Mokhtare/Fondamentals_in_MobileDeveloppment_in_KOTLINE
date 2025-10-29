fun main(){

    // MutableList : to do a colecttion of deferent types
    // using MutableList we can add and remove element from the list (read/write)
    // you can add the type to mutableListOf <Int>
    // you can print the MutableList directly
    // you change the value of an element by using its index
    var info=mutableListOf("ali", "reda", 2025)
    var info2=mutableListOf<Int>(2023,2024, 2025)
    info[0]=2000
    info2.add(2026)
    info2.remove(2025)

    println(info)
    println(info2)




    // List : to do a colection/list of a specific type(String, Int, ...)
    // you can add the type to List <String>
    // using List you have accesse to read functions only
    // you can print the list directly
    // you can not change the value of an element
    var names:List<String> = listOf("ayman", "ahmad","akram")
    println(names);



    // Array : to do a colection of specific type
    // by using Array you don't have permetion to add or remove an element
    // you can only edit the value of elements
    var table:Array<Int> =arrayOf(1,2,3,4)

    // the function joinToString() is to print the element in array as a string
    println(table.joinToString("#"))
    println(table.joinToString(prefix="<",separator="-", postfix = ">"))
    println(table.contentToString())

}
