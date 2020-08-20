class AreaOrPerimeter {
    fun areaOrPerimeter(l: Int, w: Int) =
        if (l == w) {
            l * w
        } else {
            2 * l + 2 * w
        }
}