fun operation(a: Int, b: Int, operate: (Int, Int) -> Int): Int {							// Unit => no data type
    return operate(a,b);
}

fun main() {
	// high order functions
    // functions which can take functions as input and can return functions as output <- 
    // we are passing functions as parameters or input to the functions here ! 
    // operate function will work on a,b
    val output = operation (2, 4,) { a,b ->
        print("Adding these two numbers:")
        a+b
    };
                            
    println(output) 
}
