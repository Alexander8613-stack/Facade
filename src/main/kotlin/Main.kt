import facade.ApiManager
import facade.CacheManager
import facade.UserManager

fun main(args: Array<String>) {
    val apiManager = ApiManager()
    val cacheManager = CacheManager()
    val userManager = UserManager(apiManager,cacheManager)

    val userId = 1
    val userData = userManager.getUserData(userId)
    println(userData)


    val userData2 = userManager.getUserData(userId)//возвращает закешированные данные
    println(userData2)
}