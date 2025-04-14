# Scala 3 macro annotation incremental compilation

This repo demonstrates an issue where changes to the `transform` method of a Scala 3 macro annotation do not invalidate
sources that use the annotation.

To test:

1. Clone this repo
2. `cd` into it
3. Run `sbt compile`
    1. You'll see `*** transform` printed
4. Edit [`src/main/scala/example/Annotation.scala`](src/main/scala/example/Annotation.scala) and change the string that's passed to `println` on line 10
5. Run `sbt compile` again
    1. Note that you don't see anything printed this time because [`src/main/scala/example/Test.scala`](src/main/scala/example/Test.scala) was not recompiled
