package magicalnumber

fun generateMagicNumber(num : Int) : Int {
    var ans = reverseNumber(num + 111)
    return ans
}

fun generateInputNumber(num: Int) : Int {
    return reverseNumber(num) - 111
}

fun reverseNumber(num : Int) : Int {
    var temp = num
    var revsNumber: Int = 0
    while(temp > 0) {
        revsNumber = revsNumber * 10 + (temp%10)
        temp /= 10
    }
    return revsNumber
}