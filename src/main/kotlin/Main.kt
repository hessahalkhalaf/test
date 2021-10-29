open class Product{

    var productType = readLine()!!


}


open class Productprice: Product() {
var price = readLine()!!.toInt()
     fun actualPrice(): Int {
         var realPrice = if (price in 0 .. 1_000_000 ) return price
                            else 0
         return realPrice
     }

    fun productPrice(): Int{
      var totalPrice = if (productType == "headPhones") {

          actualPrice() * 0.11 + actualPrice()}
                      else if (productType == "TV"){
          actualPrice() * 0.17 + actualPrice()
                          }
                else if ( productType == "laptop"){
          actualPrice() * 0.19 + actualPrice()
                    }
                else { 0.15 * actualPrice() + actualPrice()

                         }

        return totalPrice.toInt()

    }

}

fun main() {
    var finaleprice = Productprice().productPrice()
    println(finaleprice)
}