fun main() {
    print("Enter a string: ") // نمایش پیام برای گرفتن رشته از کاربر
    val input = readLine() ?: "" // گرفتن رشته و جلوگیری از null بودن

    val counts = countChars(input) // فراخوانی تابع شمارش حروف
    println("Character counts: $counts") // نمایش تعداد تکرار هر حرف
}

// تابعی برای شمارش تعداد هر حرف در رشته
fun countChars(text: String): Map<Char, Int> {
    val charCount = mutableMapOf<Char, Int>() // ساختن یک مپ قابل تغییر برای ذخیره تعداد حروف

    for (char in text) {
        val currentCount = charCount[char] ?: 0 // گرفتن تعداد فعلی یا صفر اگر وجود نداشت
        charCount[char] = currentCount + 1 // افزایش تعداد به اندازه 1
    }

    return charCount // بازگرداندن مپ تعداد حروف
}