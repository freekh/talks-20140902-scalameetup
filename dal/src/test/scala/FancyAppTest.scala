import org.scalatest.FunSuite

class FancyAppSuite extends FunSuite {
  test("Name should read input.data resource") {
    assert(FancyData.name == "Scala meetup")
  }
}
