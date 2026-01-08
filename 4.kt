fun main(){
	val age = 23
    if(age == 24){
        println("you can't play at home")
    }else{
        println("go for work")
    }
    
    val ani: Int = if(age < 20){
        println("inside true")
        10
    }else{
		20
    }
    
    println(ani)
    
    // "How does when work?"
	val name = "Hello"
    val x = when(name) {
        "Anirudh"->{
            println("Awesome")
        }
        "Hello"->{
            println("wow")
        }
        else->{
            println("No Problem")
        }
    }
    
    print(x)
}

