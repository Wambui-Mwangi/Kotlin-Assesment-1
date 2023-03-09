fun main(){
    var index = str("Kotlin", "Morning")
    println(index)

   var arrResult = arr(arrayOf(2, 4, 6, 8))
    println(arrResult.contentToString())

    letters("Wambui")

    var morning = join(arrayOf("Good", "Morning", "Kim"))
    println(morning)

    val calc = Calculator(4, 2)
    calc.addition()
    calc.subtraction()
    calc.division()
    calc.multiplication()
}

//Question 1
fun str(s1:String, s2:String):Char{
    var r = s2.compareTo(s1)
    if (s1 == s2)
        return s1[1]
    }
    else{

        return s1[1]
    }
}

//Question 2
fun arr(nums:Array<Int>):Array<Any>{
    return arrayOf(nums.min(), nums.max(), nums.average())
}

//Question 3
fun letters(let:String){
    for (l in let){
        println(l)
    }

}

//Question 4
fun join(words:Array<String>):String{
    var joined = words.toString()
    return joined

}

//Question 5
class Calculator(var number1:Int, var number2:Int){
    fun addition(){
        println(number1+number2)
    }

    fun subtraction(){
        println(number1-number2)
    }

    fun division(){
        println(number1/number2)
    }

    fun multiplication (){
        println(number1*number2)
    }
}