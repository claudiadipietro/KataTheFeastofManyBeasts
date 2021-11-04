class kata {
    fun feast(beast: String, dish: String): Boolean {

        val firstBeast = beast.first()
        val lastBeast = beast.last()
        val firstDish = dish.first()
        val lastDish = dish.last()


        if (firstBeast == firstDish && lastBeast == lastDish){
            return true
        } else return false

    }
}