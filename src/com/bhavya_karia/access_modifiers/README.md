# Access Modifiers

Four access modifiers are:

1. public
2. private
3. protected
4. internal

**Key Points**

1. By default, classes are public in Kotlin, unlike Java where they are package private.
2. Unlike Java, classes can be private and only items in that file can access them.
3. In Kotlin, outer class cannot see private members of the inner class.
4. The jvm converts the `internal` modifier to public on compilation.
5. Special attention should be given to visibility of classes when using both Java and Kotlin.

