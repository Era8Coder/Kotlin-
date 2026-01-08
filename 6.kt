fun main(){
    val names = mutableListOf("Anuj", "Shivam", "Gaurav", 1)          // mutable list <- can have any data type inside it ->  
    val names = mutableListOf<String> ("Anuj", "Shivam", "Gaurav")    // Generic String <- 
    names[0] = "Ladoo"

    println(names[0])
    
    print(i in names){
        println(name) 
    }
}
