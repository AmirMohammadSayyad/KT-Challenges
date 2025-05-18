fun main() {
    print("Enter a number: ") // نمایش پیام برای گرفتن عدد از کاربر
    val number = readLine()?.toIntOrNull() // گرفتن ورودی و تبدیلش به عدد صحیح (nullable)

    if (number == null) {
        println("Invalid input.") // بررسی اینکه ورودی معتبر بوده یا نه
        return
    }

    if (isPrime(number)) {
        println("$number is a prime number.") // اگر عدد اول باشه، این پیام چاپ میشه
    } else {
        println("$number is not a prime number.") // اگر اول نباشه، این پیام چاپ میشه
    }
}

// تابعی برای بررسی اول بودن عدد
fun isPrime(num: Int): Boolean {
    if (num < 2) return false // اعداد کوچکتر از 2 اول نیستند
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false // اگر عدد بر i بخش‌پذیر باشه، اول نیست
    }
    return true // اگر هیچ مقسومی نداشت، اول هست
}