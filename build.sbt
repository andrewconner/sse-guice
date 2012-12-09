scalaVersion := "2.10.0-RC1"

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "kevoree Repository" at "http://maven2.kevoree.org/release/",
  "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/"
)

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "3.0",
  "org.scalatest" % "scalatest_2.10.0-RC5" % "2.0.M5-B1" % "test"
)
