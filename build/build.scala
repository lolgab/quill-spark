import cbt._

class Build(val context: Context) extends BaseBuild with SbtLayoutMain {
  override def name = "spark-quill"

  override val defaultScalaVersion = "2.11.12"

  override def dependencies = {
    super.dependencies ++ Resolver(mavenCentral).bind(
      ScalaDependency("org.apache.spark", "spark-sql", "2.2.0"),
      ScalaDependency("io.getquill", "quill-sql", "2.3.2"),
      ScalaDependency("io.getquill", "quill-spark", "2.3.2")
    )
  } 
} 
