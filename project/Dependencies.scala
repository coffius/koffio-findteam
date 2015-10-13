import sbt._
import Keys._

object Dependencies {
	val scaldi          = "org.scaldi"    				%% 	"scaldi"              % "0.5.6"
	val scalaTest       = "org.scalatest" 				%%  "scalatest"           % "2.2.4"

	val scaldiPlay			= "org.scaldi" 						%% "scaldi-play" 					% "0.5.8"
	val slick						= "com.typesafe.slick" 		%% "slick" 								% "3.0.0"
	val postgres				=	"org.postgresql" 				%  "postgresql" 					% "9.3-1101-jdbc41"
	val slf4j						=	"org.slf4j" 						%  "slf4j-nop" 						% "1.6.4"
	val scalaz					=	"org.scalaz" 						%% "scalaz-core" 					% "7.1.3"
	val silhouette 			= "com.mohiva" 						%% "play-silhouette"      % "3.0.0"

	val common = Seq(
		scaldi,
		slf4j,
		scalaz,
		scalaTest % "test"
	)

	val model = Seq(
		slick,
		postgres
	)

	val services: Seq[ModuleID] = Seq.empty

	val webapp = Seq(
		slick,
		scaldiPlay,
    silhouette
	)
}