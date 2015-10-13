Common.moduleSettings("model")

libraryDependencies ++= Dependencies.common ++ Dependencies.model

seq(flywaySettings: _*)

seq(scalikejdbcSettings:_*)

flywayUrl := Option(System.getenv("TEST_DB_URL")).getOrElse("jdbc:postgresql://192.168.11.11:5432/play-with-me")

flywayUser := "admin"

flywayPassword := "admin"

flywayLocations := Seq("classpath:migration/v1")