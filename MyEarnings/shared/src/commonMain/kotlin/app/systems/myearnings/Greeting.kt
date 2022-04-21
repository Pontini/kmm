package app.systems.myearnings

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}