package pjatk.pamo.bmi

class zad4 {

    /**
     * Exercise
     * Explicitly declare the correct type for each variable:
     * fun main() {
     *     val a: Int = 1000
     *     val b = "log message"
     *     val c = 3.14
     *     val d = 100_000_000_000_000
     *     val e = false
     *     val f = '\n'
     * }
     */
    fun main() {
        val a: Int = 1000
        val b: String = "log message"
        val c: Double = 3.14
        val d: Long = 100_000_000_000_000
        val e: Boolean = false
        val f: Char = '\n'
    }
    /**
     * Exercise
     * Complete the code to make the program print "Mary is 20 years old" to standard output:
     * fun main() {
     *     val name = "Mary"
     *     val age = 20
     *     // Write your code here
     * }
     * You can't change a read-only variable once you have given it a value.
     * Variables can be declared outside the main() function at the beginning of your program. Variables declared in this way are said to be declared at top level.
     * We recommend that you declare all variables as read-only (val) by default. Declare mutable variables (var) only if necessary.
     */
    fun main() {
        val name = "Mary"
        val age = 20
        println("$name is $age years old")
    }
    /**
     * Exercise 1
     * You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
     * fun main() {
     *     val greenNumbers = listOf(1, 4, 23)
     *     val redNumbers = listOf(17, 2)
     *     // Write your code here
     * }
     */
    fun main() {
        val greenNumbers = listOf(1, 4, 23)
        val redNumbers = listOf(17, 2)
        val totalCount = greenNumbers.count() + redNumbers.count()
        println(totalCount)
    }
    /**
     * Exercise 2
     * You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol
     * is supported or not (isSupported must be a Boolean value).
     * fun main() {
     *     val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
     *     val requested = "smtp"
     *     val isSupported = // Write your code here
     *     println("Support for $requested: $isSupported")
     * }
     * Hint:
     * Make sure that you check the requested protocol in upper case. You can use the .uppercase() function to help you with this.
     */
    fun main() {
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
        val requested = "smtp"
        val isSupported = requested.uppercase() in SUPPORTED
        println("Support for $requested: $isSupported")
    }
    /**
     * Exercise 3
     * Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.
     * fun main() {
     *     val number2word = // Write your code here
     *     val n = 2
     *     println("$n is spelt as '${<Write your code here >}'")
     * }
     */
    fun main() {
        val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
        val n = 2
        println("$n is spelt as '${number2word[n]}'")
    }
    /**
     * Exercise 1
     * Create a simple game where you win if throwing two dice results in the same number.
     * Use if to print You win :) if the dice match or You lose :( otherwise.
     * Hint:
     * Use the equality operator (==) to compare the dice results.
     * import kotlin.random.Random
     * fun main() {
     *     val firstResult = Random.nextInt(6)
     *     val secondResult = Random.nextInt(6)
     *     // Write your code here
     * }
     */
    import kotlin.random.Random

    fun main() {
        val firstResult = Random.nextInt(6)
        val secondResult = Random.nextInt(6)

        if (firstResult == secondResult)
            println("You win :)")
        else
            println("You lose :(")
    }
    /**
     * Exercise 2
     * Using a when expression, update the following program so that it prints the corresponding actions when you input the names of game console buttons.
     *
     * Button   Action
     * A        Yes
     * B        No
     * X        Menu
     * Y        Nothing
     * Other    There is no such button
     *
     * fun main() {
     *     val button = "A"
     *     println(
     *         // Write your code here
     *     )
     * }
     */
    fun main() {
        val button = "A"
        println(
            when (button) {
                "A" -> "Yes"
                "B" -> "No"
                "X" -> "Menu"
                "Y" -> "Nothing"
                else -> "There is no such button"
            }
        )
    }
    /**
     * Exercise 2
     * Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally,
     * replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz".
     * Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
     *
     * Hint 1:
     * Use a for loop to count numbers and a when expression to decide what to print at each step.
     * Hint 2:
     * Use the modulo operator (%) to return the remainder of a number being divided. Use the equality operator (==) to check if the remainder equals zero.
     *
     * fun main() {
     *     // Write your code here
     * }
     */
    fun main() {
        for (number in 1..100) {
            println(
                when {
                    number % 15 == 0 -> "fizzbuzz"
                    number % 3 == 0 -> "fizz"
                    number % 5 == 0 -> "buzz"
                    else -> "$number"
                }
            )
        }
    }
    /**
     * Exercise 3
     * You have a list of words. Use for and if to print only the words that start with the letter l.
     * Hint:
     * Use the .startsWith() function for String type.
     *
     * fun main() {
     *     val words = listOf("dinosaur", "limousine", "magazine", "language")
     *     // Write your code here
     * }
     */
    fun main() {
        val words = listOf("dinosaur", "limousine", "magazine", "language")
        for (w in words) {
            if (w.startsWith("l"))
                println(w)
        }
    }
    /**
     * Exercise 1
     * Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
     *
     * import kotlin.math.PI
     * // Write your code here
     *
     * fun main() {
     *     println(circleArea(2))
     * }
     *
     * If you use {} curly braces to declare your function body, you must declare the return type unless it is the Unit type.
     * In this exercise, you import a package so that you can access the value of pi via PI. For more information about importing packages, see Packages and imports.
     */
    import kotlin.math.PI

    fun circleArea(radius: Int): Double {
        return PI * radius * radius
    }

    fun main() {
        println(circleArea(2)) // 12.566370614359172
    }
    /**
     * Exercise 2
     * Rewrite the circleArea function from the previous exercise as a single-expression function.
     *
     * import kotlin.math.PI
     * // Write your code here
     *
     * fun main() {
     *     println(circleArea(2))
     * }
     */
    import kotlin.math.PI

    fun circleArea(radius: Int): Double = PI * radius * radius

    fun main() {
        println(circleArea(2)) // 12.566370614359172
    }
    /**
     * Exercise 3
     * You have a function that translates a time interval given in hours, minutes, and seconds into seconds.
     * In most cases, you need to pass only one or two function parameters while the rest are equal to 0.
     * Improve the function and the code that calls it by using default parameter values and named arguments so that the code is easier to read.
     *
     * fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int) =
     *     ((hours * 60) + minutes) * 60 + seconds
     *
     * fun main() {
     *     println(intervalInSeconds(1, 20, 15))
     *     println(intervalInSeconds(0, 1, 25))
     *     println(intervalInSeconds(2, 0, 0))
     *     println(intervalInSeconds(0, 10, 0))
     *     println(intervalInSeconds(1, 0, 1))
     * }
     */
    fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
        ((hours * 60) + minutes) * 60 + seconds

    fun main() {
        println(intervalInSeconds(1, 20, 15))
        println(intervalInSeconds(minutes = 1, seconds = 25))
        println(intervalInSeconds(hours = 2))
        println(intervalInSeconds(minutes = 10))
        println(intervalInSeconds(hours = 1, seconds = 1))
    }
    /**
     * Exercise 1
     * You have a list of actions supported by a web service, a common prefix for all requests,
     * and an ID of a particular resource. To request an action title over the resource with ID: 5,
     * you need to create the following URL: https://example.com/book-info/5/title.
     * Use a lambda expression to create a list of URLs from the list of actions.
     *
     * fun main() {
     *     val actions = listOf("title", "year", "author")
     *     val prefix = "https://example.com/book-info"
     *     val id = 5
     *     val urls = // Write your code here
     *     println(urls)
     * }
     */
    fun main() {
        val actions = listOf("title", "year", "author")
        val prefix = "https://example.com/book-info"
        val id = 5
        val urls = actions.map { action -> "$prefix/$id/$action" }
        println(urls)
    }
    /**
     * Exercise 2
     * Write a function that takes an Int value and an action (a function with type () -> Unit)
     * which then repeats the action the given number of times.
     * Then use this function to print “Hello” 5 times.
     *
     * fun repeatN(n: Int, action: () -> Unit) {
     *     // Write your code here
     * }
     * fun main() {
     *     // Write your code here
     * }
     */
    fun repeatN(n: Int, action: () -> Unit) {
        for (i in 1..n) {
            action()
        }
    }

    fun main() {
        repeatN(5) {
            println("Hello")
        }
    }
    /**
     * Exercise 1
     * Define a data class Employee with two properties: one for a name, and another for a salary.
     * Make sure that the property for salary is mutable, otherwise you won’t get a salary boost at the end of the year!
     * The main function demonstrates how you can use this data class.
     *
     * // Write your code here
     *
     * fun main() {
     *     val emp = Employee("Mary", 20)
     *     println(emp)
     *     emp.salary += 10
     *     println(emp)
     * }
     */
    data class Employee(val name: String, var salary: Int)

    fun main() {
        val emp = Employee("Mary", 20)
        println(emp)
        emp.salary += 10
        println(emp)
    }
    /**
     * Exercise 2
     * Declare the additional data classes that are needed for this code to compile.
     *
     * data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
     * // Write your code here
     * // data class Name(...)
     *
     * fun main() {
     *     val person = Person(
     *         Name("John", "Smith"),
     *         Address("123 Fake Street", City("Springfield", "US")),
     *         ownsAPet = false
     *     )
     * }
     */
    data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
    data class Name(val first: String, val last: String)
    data class Address(val street: String, val city: City)
    data class City(val name: String, val countryCode: String)

    fun main() {
        val person = Person(
            Name("John", "Smith"),
            Address("123 Fake Street", City("Springfield", "US")),
            ownsAPet = false
        )
    }
    /**
     * Exercise 3
     * To test your code, you need a generator that can create random employees.
     * Define a RandomEmployeeGenerator class with a fixed list of potential names (inside the class body).
     * Configure the class with a minimum and maximum salary (inside the class header).
     * In the class body, define the generateEmployee() function.
     * Once again, the main function demonstrates how you can use this class.
     *
     * Hint 1
     * Lists have an extension function called .random() that returns a random item within a list.
     * Hint 2
     * Random.nextInt(from = ..., until = ...) gives you a random Int number within specified limits.
     *
     * import kotlin.random.Random
     * data class Employee(val name: String, var salary: Int)
     * // Write your code here
     *
     * fun main() {
     *     val empGen = RandomEmployeeGenerator(10, 30)
     *     println(empGen.generateEmployee())
     *     println(empGen.generateEmployee())
     *     println(empGen.generateEmployee())
     *     empGen.minSalary = 50
     *     empGen.maxSalary = 100
     *     println(empGen.generateEmployee())
     * }
     */
    import kotlin.random.Random

    data class Employee(val name: String, var salary: Int)

    class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
        private val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")

        fun generateEmployee() =
            Employee(
                names.random(),
                Random.nextInt(from = minSalary, until = maxSalary)
            )
    }

    fun main() {
        val empGen = RandomEmployeeGenerator(10, 30)
        println(empGen.generateEmployee())
        println(empGen.generateEmployee())
        println(empGen.generateEmployee())
        empGen.minSalary = 50
        empGen.maxSalary = 100
        println(empGen.generateEmployee())
    }
    /**
     * Exercise
     * You have the employeeById function that gives you access to a database of employees of a company.
     * Unfortunately, this function returns a value of the Employee? type, so the result can be null.
     * Your goal is to write a function that returns the salary of an employee when their id is provided,
     * or 0 if the employee is missing from the database.
     *
     * data class Employee(val name: String, var salary: Int)
     * fun employeeById(id: Int) = when(id) {
     *     1 -> Employee("Mary", 20)
     *     2 -> null
     *     3 -> Employee("John", 21)
     *     4 -> Employee("Ann", 23)
     *     else -> null
     * }
     * fun salaryById(id: Int) = // Write your code here
     *
     * fun main() {
     *     println((1..5).sumOf { id -> salaryById(id) })
     * }
     */
    data class Employee(val name: String, var salary: Int)

    fun employeeById(id: Int) = when(id) {
        1 -> Employee("Mary", 20)
        2 -> null
        3 -> Employee("John", 21)
        4 -> Employee("Ann", 23)
        else -> null
    }

    fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

    fun main() {
        println((1..5).sumOf { id -> salaryById(id) })
    }


































}