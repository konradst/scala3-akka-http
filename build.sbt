val scala3Version = "3.2.1"
val AkkaVersion = "2.7.0"
val AkkaHttpVersion = "10.4.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Project Template",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
// https://doc.akka.io/docs/akka-http/current/introduction.html#routing-dsl-for-http-servers
// https://scala-lang.org/blog/2021/04/08/scala-3-in-sbt.html#using-scala-213-libraries-in-scala-3
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
      "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
    ).map(_.cross(CrossVersion.for3Use2_13)) //
  )
