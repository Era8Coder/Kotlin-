fun add(a: Int, b: Int) : Int{
    return a + b
}

fun greetings(greet : String = "Good Night", name : String){				// can change the order of the input variables <- 
    print("Hello $greet")
}

fun main() {
	print(add(2,5))
    println()
    greetings()
    println()
    greetings("Anirudh")
    println()
    greetings(name = "Anuj", greet = "Good Evening")
}

