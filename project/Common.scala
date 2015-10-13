import sbt._
import Keys._
import play.sbt.PlayImport._

object Common {
	def appName = "playwithme"
	
	// Common settings for every project
	def settings (theName: String) = Seq(
		name := theName,
		organization := "com.playwithme",
		version := "0.1",
		sbtVersion := "0.13.8",
		scalaVersion := "2.11.7",
		doc in Compile <<= target.map(_ / "none"),
		scalacOptions ++= Seq(
			"-feature",
			"-deprecation",
			"-unchecked",
			"-language:reflectiveCalls",
			"-language:postfixOps",
			"-language:implicitConversions"
		),
		resolvers ++= Seq(
			"Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
			"Typesafe" at "http://repo.typesafe.com/typesafe/releases",
			"fwbrasil.net" at "http://fwbrasil.net/maven/",
			"Atlassian Releases" at "https://maven.atlassian.com/public/"
		)
	)
	// Settings for the app, i.e. the root project
	val appSettings = settings(appName)

	def moduleSettings (module: String) = settings(module)
}