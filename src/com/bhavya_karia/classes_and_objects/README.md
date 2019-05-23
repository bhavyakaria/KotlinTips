# Classes And Objects

1. **typealias**
	It allows us to create a new type that is simply an alias of an existing type.
        It carries no overhead or benefit. The alias is simply replaced by the compiler.

```kotlin
// if we are gonna use the below hash map many times in the code then we can use type alias to simplify our code
typealias team = HashMap<String, String>

// now you can use 'team' wherever you have to write 'HashMap<String, String>'
val userList: team = hashMapOf("Man City" to "EPL", "Real Madrid" to "La Liga", "Juventus" to "Serie A")

fun processData(userList: team) {
    // do whatever you want...
```


