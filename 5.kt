fun main(){
	val names = arrayOf("A", "B", "C")
    // print(names)			// it will print the address <- 
    
    for (i in names){
        println(i)
    }
    println(" ")
	names.forEach {
        println(it)
    }
    println(" ")
    for (i in 0..3){
        println(i)
    }
    println(" ")
    for (i in 2..8 step 2){
        println(i)
    }
    println(" ")
    for (i in 3 downTo 0){
        println(i)
    }
}

