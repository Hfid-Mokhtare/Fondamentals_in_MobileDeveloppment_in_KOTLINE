fun main(){

    // MutableSet : creating a colection of type set to avoid repeted element

    // if you use MutableSet you can read and Write on the set
    val set1:MutableSet<Int> = mutableSetOf(1,2,3,1,4)
    set1.add(0)
    println(set1.joinToString()) // 1, 2, 3, 4, 0


    // if you use Set you can only read from the set
    val set2:Set<Int> = setOf(1,2,3,1,4)
    println(set2.joinToString()) // 1, 2, 3, 4


    // you can create a map
    val tableMap:Map<Int,String> =mutableMapOf(Pair(1,"java"),Pair(2,"kotlin"),Pair(3,"Swift"))
    println(tableMap) // {1=java, 2=kotlin, 3=Swift}

    
    val tableMap2:MutableMap<Int, String> = mutableMapOf(1 to "C++",2 to "C#",3 to "Kotlin")
    tableMap2[5]="Java"
    println(tableMap2)
}

