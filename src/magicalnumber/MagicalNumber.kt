package magicalnumber

data class MagicalNumber(val inputnumber: Int = 0, val magicnumber: Int = 0) {
    fun generateNumber() {
        if (inputnumber.equals(0)) println("Your generated input number is : ${generateInputNumber(magicnumber)}")
        else println("Your generated magic number is : ${generateMagicNumber(inputnumber)}")
    }
}