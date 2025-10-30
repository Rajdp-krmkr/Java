## String Builder
Strings are immutable in Java. Once a string is created, it cannot be changed.
However, there are scenarios where you need to perform multiple modifications to a string, such as appending, inserting, or deleting characters. In such cases, using `StringBuilder` is more efficient than using `String` because `StringBuilder` is mutable and allows for in-place modifications.