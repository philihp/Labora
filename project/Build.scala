import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "Labora"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "be.objectify"  %%  "deadbolt-java"     % "2.1-SNAPSHOT",
      "com.feth"      %%  "play-authenticate" % "0.2.5-SNAPSHOT",
      "mysql" % "mysql-connector-java" % "5.1.18",
      javaCore,
      javaJdbc,
      javaEbean
    )
    
    val main = play.Project(appName, appVersion, appDependencies).settings(
      
      resolvers += Resolver.url("Objectify Play Repository (release)", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("Objectify Play Repository (snapshot)", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("play-easymail (release)", url("http://joscha.github.com/play-easymail/repo/releases/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("play-easymail (snapshot)", url("http://joscha.github.com/play-easymail/repo/snapshots/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("play-authenticate (release)", url("http://joscha.github.com/play-authenticate/repo/releases/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("play-authenticate (snapshot)", url("http://joscha.github.com/play-authenticate/repo/snapshots/"))(Resolver.ivyStylePatterns),
	  resolvers += Resolver.url("Typesafe Ivy Snapshots Repository", url("http://repo.typesafe.com/typesafe/ivy-snapshots/"))(Resolver.ivyStylePatterns),
      templatesImport += "be.objectify.deadbolt.java.views.html._",
      templatesImport += "be.objectify.deadbolt.core.utils.TemplateUtils._"
    )

}
