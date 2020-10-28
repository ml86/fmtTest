import mill._
import mill.scalalib._
import mill.scalalib.scalafmt.ScalafmtModule

object module1 extends SbtModule with ScalafmtModule {
  def scalaVersion = "2.13.1"
}

object module2 extends SbtModule with ScalafmtModule {
  def scalaVersion = "2.13.1"
}
