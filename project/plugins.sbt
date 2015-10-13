resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Flyway" at "http://flywaydb.org/repo"
)

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.2")

//Flyway plugin
addSbtPlugin("org.flywaydb" % "flyway-sbt" % "3.2.1")

//Scalike mapper
addSbtPlugin("org.scalikejdbc" %% "scalikejdbc-mapper-generator" % "2.2.4")

libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1101-jdbc41"