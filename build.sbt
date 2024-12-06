import laika.helium.Helium
import laika.helium.config._
import laika.ast.Path.Root
import laika.format.Markdown
import laika.config.SyntaxHighlighting

ThisBuild / tlBaseVersion := "0.0" // your current series x.y

ThisBuild / organization := "dev.capslock"
ThisBuild / organizationName := "Windymelt"
ThisBuild / startYear := Some(2024)
ThisBuild / licenses := Seq(License.MIT)
ThisBuild / developers ++= List(
  // your GitHub handle and name
  tlGitHubDev("windymelt", "Windymelt")
)

val scala3Version = "3.5.2"

ThisBuild / scalaVersion := scala3Version

lazy val Theme = new {
  import laika.helium.config._
  import laika.theme.config.Color
  val primary = Color.hex("ff6188")
  val primaryMedium = Color.hex("727072")
  val primaryLight = Color.hex("403e41")
  val secondary = Color.hex("ab9df2")
  val text = Color.hex("fcfcfa")
  val background = Color.hex("2d2a2e")
  val landingPageGradient = Color.hex("221f22")
  val info = Color.hex("78dce8")
  val warning = Color.hex("fc9867")
  val error = Color.hex("ff6188")
}
lazy val theme = Helium.defaults.site
  .topNavigationBar(
    homeLink = IconLink.internal(Root / "README.md", HeliumIcon.home),
    navLinks = Seq(),
    versionMenu = VersionMenu.create(
      versionedLabelPrefix = "Version:",
      unversionedLabel = "Choose Version"
    ),
    highContrast = true
  )
  .site.darkMode.disabled
  .site
  .themeColors(
    primary = Theme.primary,
    secondary = Theme.secondary,
    primaryMedium = Theme.primaryMedium,
    primaryLight = Theme.primaryLight,
    text = Theme.text,
    background = Theme.background,
    bgGradient = (Theme.landingPageGradient, Theme.primaryLight)
  )
  .build

lazy val core = project
  .in(file("."))
  .settings(
    name := "sbt-typelevel-site-exercise",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )

lazy val site = project
  .in(file("site"))
  .enablePlugins(TypelevelSitePlugin)
  .settings(
    laikaTheme := theme,
    laikaExtensions := Seq(
      Markdown.GitHubFlavor,
      SyntaxHighlighting
    )
  )

ThisBuild / tlSitePublishBranch := Some("main")
