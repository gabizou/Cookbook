import sbt.Keys._

name := "ScalaFireball"

version := "1.0"

name := "ScalaFireball"

organization := "org.spongepowered.cookbook.plugin"

scalaVersion := "2.11.1"

libraryDependencies += "org.spongepowered" % "spongeapi" % "1.1-SNAPSHOT"

resolvers += Resolver.url("http://repo.spongepowered.org/maven")

resolvers += Resolver.sonatypeRepo("snapshots")

