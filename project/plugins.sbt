resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.url(
  "heroku-sbt-plugin-releases",
  url("https://dl.bintray.com/heroku/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")
addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.1.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.1.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.2")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "1.0.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.0.0")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
