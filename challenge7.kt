fun main() {
    print("Enter numbers separated by space: ") // نمایش پیام برای گرفتن لیست اعداد از کاربر
    val input = readLine() ?: "" // دریافت رشته ورودی

    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }.toMutableList() // تبدیل رشته به لیست عدد صحیح قابل تغییر

    if (numbers.isEmpty()) {
        println("No valid numbers entered.") // اگر لیست خالی بود، پیام خطا نمایش داده میشه
        return
    }

    bubbleSort(numbers) // فراخوانی تابع مرتب‌سازی حبابی
    println("Sorted list: $numbers") // نمایش لیست مرتب‌شده
}

// تابع مرتب‌سازی به روش bubble sort
fun bubbleSort(list: MutableList<Int>) {
    val n = list.size // گرفتن اندازه لیست
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (list[j] > list[j + 1]) {
                // اگر عنصر فعلی بزرگ‌تر از عنصر بعدی بود، جای آن‌ها را عوض می‌کنیم
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }
}