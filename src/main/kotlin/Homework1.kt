

fun main() {
    ///////////////////////////////
//question 1

    // 3 input , 2 num 1 op

    println ("intr whet you want / or * ")
    var op :String = readLine()!!.toString()


    println ("enter num 1")
    var input1 :Int = readLine()!!.toInt()


    println ("enter num 2")
    var input2 :Int = readLine()!!.toInt()


                                                                                                                                                                                                  var result:Int=0
    // if statnent to get result

    if (op =="/"&& input2 !=0) result = input1 / input2


    else if (op =="*") result = input1 * input2


    else println("Error")


    println("result : $result")
  //  println("result"+ result)




///////////////////////////////
//question 2

println ("please enter the salary ")
    var salery = readLine()!!.toDouble()



    println ("enter tag 1 or 2 or 3  ")
    var ooop = readLine()!!.toInt()


    // if statnent to get result

    if(ooop ==1){
        println ("the salary of employee is salary"+((salery+(salery*6)/100)))

    }
    else if (ooop == 2){
        println("the new salary of employee is "+ ((salery+(salery*4)/100)))
    }

    else if (ooop==3 )
        println("the new salary of employee is "+((salery+(salery*1.5)/100)))




}