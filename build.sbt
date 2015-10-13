Common.appSettings

lazy val model = project in file("scala/model")

lazy val services = (project in file("scala/services")).dependsOn(model)

lazy val webapp = (project in file("scala/webapp")).enablePlugins(PlayScala).dependsOn(services)
