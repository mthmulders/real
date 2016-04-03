//
// Define dependency versions
//
lazy val hikariCpVer = "2.4.5"
lazy val playVer     = "2.5.1"
lazy val slickVer    = "3.1.1"

//
// Define dependencies
//
lazy val hikariCp     = "com.zaxxer"         %  "HikariCP"      % hikariCpVer
lazy val slick        = "com.typesafe.slick" %% "slick"         % slickVer
lazy val slickCodegen = "com.typesafe.slick" %% "slick-codegen" % slickVer


lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(Seq(
    libraryDependencies ++= Seq(
      jdbc,
      slick,
      slickCodegen,
      hikariCp,
      specs2 % Test
    ),
    name := "real",
    publishArtifact in (Compile, packageDoc) := false,
    publishArtifact in packageDoc := false,
    scalaVersion := "2.11.7",
    sources in (Compile, doc) := Seq.empty,
    topLevelDirectory := Some("repo"),
    version := "0.1.0-SNAPSHOT"
  )
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
