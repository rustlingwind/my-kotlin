package `fun`.bruce.study.kotlin.basic

class User(val id:Int, val name: String, val address: String)

fun saveUser1(user: User) {
    fun validate(fieldName: String, fieldValue: String) {
        if (fieldValue.isEmpty()) {
            throw IllegalArgumentException("Cannot save user ${user.id}: ${fieldName} is empty")
        }
    }

    validate("Name", user.name)
    validate("Address", user.address)

    println("User ${user.id} saved")
}

fun saveUser2(user: User) {
    fun User.validate(fieldName: String, fieldValue: String) {
        if (fieldValue.isEmpty()) {
            throw IllegalArgumentException("Cannot save user ${user.id}: ${fieldName} is empty")
        }
    }

    user.validate("Name", user.name)
    user.validate("Address", user.address)

    println("User ${user.id} saved")
}

fun User.validateBeforeSave() {
    fun validate(fieldName: String, fieldValue: String) {
        if (fieldValue.isEmpty()) {
            throw IllegalArgumentException("Cannot save user ${id}: ${fieldName} is empty")
        }
    }

    validate("Name", name)
    validate("Address", address)
}

fun saveUser3(user: User) {
    user.validateBeforeSave()
    println("User ${user.id} saved")
}


fun main(args:Array<String>) {
    val u = User(1, "", "")

    try {
        saveUser1(u)
    }catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        saveUser2(u)
    }catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        saveUser3(u)
    }catch (e: IllegalArgumentException) {
        println(e.message)
    }

}
