package facade

interface UserDataProvider {
    fun getUserData(userId:Int) :UserData?
}