fun main() {
    print("Enter the number of Fibonacci terms: ") // نمایش پیام برای گرفتن تعداد جملات از کاربر
    val n = readLine()?.toIntOrNull() // گرفتن ورودی و تبدیل آن به عدد صحیح

    if (n == null || n <= 0) {
        println("Invalid input.") // اگر ورودی نامعتبر یا صفر و منفی بود، پیام خطا نمایش داده میشه
        return
    }

    printFibonacci(n) // فراخوانی تابع چاپ دنباله فیبوناچی
}

// تابعی برای چاپ n جمله اول دنباله فیبوناچی
fun printFibonacci(n: Int) {
    var a = 0 // مقدار اولیه جمله اول دنباله فیبوناچی
    var b = 1 // مقدار اولیه جمله دوم دنباله فیبوناچی

    for (i in 1..n) {
        print("$a ") // چاپ جمله فعلی دنباله
        val next = a + b // محاسبه جمله بعدی با جمع دو جمله قبلی
        a = b // بروزرسانی مقدار a به جمله قبلی b
        b = next // بروزرسانی مقدار b به جمله بعدی
    }
}