fun main(){
    // can write without specifying data types also
	var x: Int = 5			// mutable
    val y: Int = 18			// immutable
    print(x::class.simpleName)
    
    x = 10
    // y = 15			<->  it can't be changed or mutated
    
    println(x)
    println(y)
    println("<=>")	
        
    var name: String = "Anirudh"
    println(y::class.simpleName)
    println("name is $name")
}

