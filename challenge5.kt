fun main() {
    print("Enter a string: ") // نمایش پیام برای گرفتن رشته از کاربر
    val input = readLine() ?: "" // گرفتن رشته از کاربر و جلوگیری از مقدار null

    if (isPalindrome(input)) {
        println("\"$input\" is a palindrome.") // اگر رشته پالینڈروم باشه، این پیام چاپ میشه
    } else {
        println("\"$input\" is not a palindrome.") // اگر نباشه، این پیام چاپ میشه
    }
}

// تابعی برای بررسی پالینڈروم بودن رشته
fun isPalindrome(text: String): Boolean {
    val reversed = text.reversed() // معکوس کردن رشته با تابع آماده reversed
    return text == reversed // بررسی برابر بودن رشته اصلی و معکوس‌شده
}