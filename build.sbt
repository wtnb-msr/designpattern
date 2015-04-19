name := "design"

version := "1.0"

organization := "design"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.specs2" %% "specs2-junit" % "3.4" % "test"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

javacOptions ++= Seq(
  "-source", "1.6",
  "-target", "1.6",
  "-encoding", "UTF-8"
)

scalacOptions ++= Seq("-deprecation", "-encoding", "UTF-8")

crossPaths := false
