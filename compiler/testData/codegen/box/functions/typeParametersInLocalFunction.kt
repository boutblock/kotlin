// WITH_RUNTIME

fun <R : Any, T, C : MutableList<R>> List<out T>.mapTo(destination: C, transform: (T) -> R): C {
    for (element in this) {
        transform(element).let {
            // This lambda only gets C and R as type parameters
            destination.add(it)
        }
    }
    return destination
}

fun box(): String {
    val outList = mutableListOf<String>()
    arrayOf("OK").mapTo(outList) { it }
    return outList.first()
}
