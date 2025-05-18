fun main() {
    print("Enter a string: ") // نمایش پیام برای گرفتن رشته از کاربر
    val input = readLine() ?: "" // گرفتن ورودی و اطمینان از اینکه نال نباشه

    val reversed = reverseString(input) // فراخوانی تابع برای معکوس کردن رشته
    println("Reversed string: $reversed") // نمایش نتیجه‌ی معکوس شده
}

// تابعی برای معکوس کردن رشته
fun reverseString(text: String): String {
    return text.reversed() // استفاده از تابع آماده‌ی reversed برای برگردوندن رشته
}