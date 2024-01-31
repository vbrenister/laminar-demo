import org.scalajs.linker.interface.ModuleSplitStyle

lazy val laminarDemo = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    scalaVersion := "3.3.1",
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(
          ModuleSplitStyle.SmallModulesFor(List("app"))
        )
    },
    libraryDependencies += "com.raquo" %%% "laminar" % "16.0.0"
  )
