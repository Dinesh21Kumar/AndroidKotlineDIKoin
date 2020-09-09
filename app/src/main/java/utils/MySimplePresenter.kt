package utils

class MySimplePresenter(val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()}"
}