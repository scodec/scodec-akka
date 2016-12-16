import com.typesafe.tools.mima.core._
import com.typesafe.tools.mima.plugin.MimaKeys._

scodecModule := "scodec-akka"
scodecPrimaryModule
scodecPrimaryModuleJvm

contributors ++= Seq(Contributor("mpilquist", "Michael Pilquist"))

rootPackage := "scodec.interop.akka"

crossScalaVersions := crossScalaVersions.value.filterNot { _.startsWith("2.10.") }

libraryDependencies ++= Seq(
  "org.scodec" %% "scodec-core" % "1.10.3",
  "com.typesafe.akka" %% "akka-stream" % "2.4.14",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

// Shapeless 2.1.0 on Scala 2.10 requires macro paradise
libraryDependencies ++= {
  if (scalaBinaryVersion.value startsWith "2.10") Seq(compilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)) else Nil
}

binaryIssueFilters ++= Seq(
)
