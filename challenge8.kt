fun main() {
    print("Enter first number: ") // نمایش پیام برای گرفتن عدد اول
    val num1 = readLine()?.toDoubleOrNull() // تبدیل ورودی به عدد اعشاری (در صورت امکان)

    print("Enter an operator (+, -, *, /): ") // گرفتن عملگر ریاضی از کاربر
    val operator = readLine() // خواندن عملگر

    print("Enter second number: ") // گرفتن عدد دوم
    val num2 = readLine()?.toDoubleOrNull() // تبدیل ورودی به عدد اعشاری

    if (num1 == null || num2 == null || operator == null) {
        println("Invalid input.") // بررسی معتبر بودن ورودی‌ها
        return
    }

    val result = calculate(num1, num2, operator) // فراخوانی تابع برای محاسبه نتیجه
    println("Result: $result") // نمایش نتیجه نهایی
}

// تابعی برای انجام عملیات ماشین حساب
fun calculate(a: Double, b: Double, op: String): String {
    return when (op) {
        "+" -> (a + b).toString() // جمع دو عدد
        "-" -> (a - b).toString() // تفریق دو عدد
        "*" -> (a * b).toString() // ضرب دو عدد
        "/" -> {
            if (b == 0.0) "Cannot divide by zero" // جلوگیری از تقسیم بر صفر
            else (a / b).toString() // تقسیم دو عدد
        }
        else -> "Unknown operator" // اگر عملگر ناشناس بود
    }
}