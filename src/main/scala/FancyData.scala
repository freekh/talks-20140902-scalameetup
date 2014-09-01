object FancyData {
  def name = io.Source
    .fromInputStream(getClass.getResourceAsStream("input.data"))
    .getLines
    .mkString("\n")
}
