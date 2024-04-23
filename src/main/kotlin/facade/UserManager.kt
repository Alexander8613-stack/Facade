package facade

class UserManager(private val apiManager: ApiManager,private val cacheManager: CacheManager) {
    fun getUserData(userId: Int): UserData? {
        val cachedUserData = cacheManager.getUserData(userId)
        if (cachedUserData != null) {
            return cachedUserData
        }

        val userData = apiManager.getUserData(userId)
        if (userData != null) {
            // Кешируем данные
            cacheManager.cacheUserData(userData)
        }
        return userData
        }
}