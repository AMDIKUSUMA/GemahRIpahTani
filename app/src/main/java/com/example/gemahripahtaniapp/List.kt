package com.example.gemahripahtaniapp



open class List (val route:String){
    data object Home : List("home")
    data object Edukasi : List ("edukasi")
    data object Ecommerce : List ("ecommerce")
    data object Komunitas : List ("komunitas")
    data object profil : List ("profil")
}
