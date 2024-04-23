package facade

class CacheManager:UserDataProvider {
    private val cache:MutableMap<Int,UserData> = mutableMapOf()
    override fun getUserData(userId: Int): UserData? {
        return cache[userId]
    }

    fun cacheUserData(userData: UserData){
        cache[userData.userId] = userData
    }
}