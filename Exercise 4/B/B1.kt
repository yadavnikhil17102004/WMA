class Employee(val eno: Int, val ename: String, val salary: Double, val designation: String) { 

    fun displayDetails() { 

        println("Employee Details:") 

        println("Emp No: $eno") 

        println("Name: $ename") 

        println("Salary: $$salary") 

        println("Designation: $designation") 

    } 

} 

 

fun main() { 

    print("Enter Employee Number: ") 

    val eno = readLine()?.toIntOrNull() ?: 0 

    print("Enter Employee Name: ") 

    val ename = readLine() ?: "" 

    print("Enter Salary: ") 

    val salary = readLine()?.toDoubleOrNull() ?: 0.0 

    print("Enter Designation: ") 

    val designation = readLine() ?: "" 

 

    val emp = Employee(eno, ename, salary, designation) 

    emp.displayDetails() 

} 