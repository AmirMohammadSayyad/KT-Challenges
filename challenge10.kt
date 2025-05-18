import kotlin.random.Random // وارد کردن کتابخانه برای تولید عدد تصادفی

fun main() {
    val target = Random.nextInt(1, 101) // تولید عدد تصادفی بین 1 تا 100
    println("Guess the number between 1 and 100") // پیام شروع بازی

    while (true) {
        print("Enter your guess: ") // درخواست حدس از کاربر
        val guess = readLine()?.toIntOrNull() // خواندن حدس و تبدیل به عدد

        if (guess == null) {
            println("Please enter a valid number.") // اگر ورودی نامعتبر بود، پیام خطا
            continue
        }

        when {
            guess < target -> println("Your guess is smaller.") // اگر حدس کوچکتر بود، راهنمایی میده
            guess > target -> println("Your guess is bigger.") // اگر حدس بزرگتر بود، راهنمایی میده
            else -> {
                println("Congratulations! You guessed the number.") // اگر درست حدس زد، تبریک میگه
                break // پایان حلقه و بازی
            }
        }
    }
}