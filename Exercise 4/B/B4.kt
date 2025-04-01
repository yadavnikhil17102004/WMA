class BankAccount(private var balance: Double) { 

    fun deposit(amount: Double) { 

        if (amount > 0) { 

            balance += amount 

            println("Deposited $$amount. New Balance: $$balance") 

        } else { 

            println("Invalid deposit amount.") 

        } 

    } 

 

    fun withdraw(amount: Double) { 

        if (amount > balance) { 

            println("Insufficient funds! Available balance: $$balance") 

        } else if (amount > 0) { 

            balance -= amount 

            println("Withdrew $$amount. New Balance: $$balance") 

        } else { 

            println("Invalid withdrawal amount.") 

        } 

    } 

 

    fun showBalance() { 

        println("Current Balance: $$balance") 

    } 

} 

 

fun main() { 

    val account = BankAccount(1000.0) // Initial balance 

 

    while (true) { 

        println("\nBanking System") 

        println("1. Deposit") 

        println("2. Withdraw") 

        println("3. Show Balance") 

        println("4. Exit") 

        print("Choose an option: ") 

        when (readLine()?.toIntOrNull()) { 

            1 -> { 

                print("Enter amount to deposit: ") 

                val amount = readLine()?.toDoubleOrNull() ?: 0.0 

                account.deposit(amount) 

            } 

            2 -> { 

                print("Enter amount to withdraw: ") 

                val amount = readLine()?.toDoubleOrNull() ?: 0.0 

                account.withdraw(amount) 

            } 

            3 -> account.showBalance() 

            4 -> { 

                println("Thank you for using our banking system.") 

                break 

            } 

            else -> println("Invalid option. Try again.") 

        } 

    } 

} 