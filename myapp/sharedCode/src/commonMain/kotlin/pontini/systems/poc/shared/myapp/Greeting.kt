package pontini.systems.poc.shared.myapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}