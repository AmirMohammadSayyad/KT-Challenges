fun main() {
    print("Enter numbers separated by space: ") // نمایش پیام برای گرفتن لیست اعداد از کاربر
    val input = readLine() ?: "" // گرفتن ورودی از کاربر (رشته‌ای از اعداد)

    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() } // جدا کردن اعداد با فاصله و تبدیل به لیست عدد صحیح

    if (numbers.isEmpty()) {
        println("No valid numbers entered.") // اگر لیست خالی بود، پیام خطا نمایش داده میشه
        return
    }

    val maxNumber = findMax(numbers) // فراخوانی تابع برای پیدا کردن بزرگ‌ترین عدد
    println("Maximum number is: $maxNumber") // نمایش بزرگ‌ترین عدد
}

// تابعی برای یافتن بزرگ‌ترین عدد در لیست
fun findMax(list: List<Int>): Int {
    var max = list[0] // فرض کردن اولین عدد به عنوان بزرگ‌ترین عدد اولیه
    for (num in list) {
        if (num > max) {
            max = num // اگر عدد فعلی از max بزرگ‌تر بود، max به‌روزرسانی میشه
        }
    }
    return max // بازگرداندن بزرگ‌ترین عدد
}