import magicalnumber.*

fun main() {

println("Please Enter a choice \n 1.no to magicalNo \n 2.MagicalNo to no")
var choice = readLine()!!.toInt()
println("Enter the no ")
   
var no = readLine()!!.toInt()  
if(choice)
{
var myNum = MagicalNumber(magicnumber = no)
myNum.generateNumber()

}
else
{
var myNumber = MagicalNumber(inputnumber = no)

myNumber.generateNumber()
}

}