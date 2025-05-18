fun main() {
    print("Enter a positive integer: ") // نمایش پیام برای گرفتن عدد از کاربر
    val number = readLine()?.toIntOrNull() // گرفتن ورودی و تبدیل آن به عدد صحیح

    if (number == null || number < 0) {
        println("Invalid input.") // اگر ورودی نامعتبر یا منفی بود، پیام خطا نمایش داده میشه
        return
    }

    val result = factorial(number) // فراخوانی تابع فاکتوریل
    println("Factorial of $number is: $result") // نمایش نتیجه فاکتوریل
}

// تابعی برای محاسبه فاکتوریل
fun factorial(n: Int): Long {
    var result = 1L // مقدار اولیه‌ی فاکتوریل روی 1 گذاشته میشه
    for (i in 1..n) {
        result *= i // ضرب همه‌ی اعداد از 1 تا n در result
    }
    return result // بازگرداندن نتیجه نهایی
}