fun main(){

    // MutableSet : creating a colection of type set to avoid repeted element

    // if you use MutableSet you can read and Write on the set
    val set1:MutableSet<Int> = mutableSetOf(1,2,3,1,4)
    set1.add(0)
    println(set1.joinToString())


    // if you use Set you can only read from the set
    val set2:Set<Int> = setOf(1,2,3,1,4)
    println(set2.joinToString())


    // you can create a map
    val tableMap:Map<Int,String> =mutableMapOf(Pair(1,"java"),Pair(2,"kotlin"),Pair(3,"Swift"))
    println(tableMap)
}
