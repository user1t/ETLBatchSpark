name := "ETLBatchSpark"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.2.0" % "provided"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.5.0"

assemblyJarName in assembly := "FirstSparkProject.jar"