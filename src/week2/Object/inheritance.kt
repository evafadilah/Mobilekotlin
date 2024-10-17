package week2.Object

import week2.Class.Manager
import week2.Class.Member
import javax.naming.ldap.ManageReferralControl

fun main() {

    val Manager = Manager("Plugin")
    Manager.sayHello("Mobile")

    val Member = Member("Eva")
    Member.sayHello("Plugin")
    //kotlin coroutines
}