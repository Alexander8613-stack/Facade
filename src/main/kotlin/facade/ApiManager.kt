package facade

class ApiManager:UserDataProvider {
    override fun getUserData(userId: Int): UserData? {
        Thread.sleep(2000)
        return UserData(userId,"Alex Kotsuba","kotsuba2021@inbox.ru")
    }
}